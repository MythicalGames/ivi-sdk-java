package games.mythical.ivi.sdk.client.observer;

import games.mythical.ivi.sdk.client.executor.IVIOrderExecutor;
import games.mythical.ivi.sdk.config.IVIConfiguration;
import games.mythical.ivi.sdk.proto.streams.order.OrderStatusConfirmRequest;
import games.mythical.ivi.sdk.proto.streams.order.OrderStatusUpdate;
import games.mythical.ivi.sdk.proto.streams.order.OrderStreamGrpc;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IVIOrderObserver implements StreamObserver<OrderStatusUpdate> {
    private final IVIOrderExecutor orderExecutor;
    private final OrderStreamGrpc.OrderStreamBlockingStub streamBlockingStub;

    public IVIOrderObserver(IVIOrderExecutor orderExecutor,
                            OrderStreamGrpc.OrderStreamBlockingStub streamBlockingStub) {
        this.orderExecutor = orderExecutor;
        this.streamBlockingStub = streamBlockingStub;
    }

    @Override
    public void onNext(OrderStatusUpdate message) {
        log.trace("IVIOrderObserver.onNext for order {}", message.getOrderId());
        try {
            orderExecutor.updateOrder(message.getOrderId(), message.getOrderState());
            updateOrderConfirmation(message.getOrderId());
        } catch (Exception e) {
            log.error("Exception calling updateOrder for {}. {}", message.getOrderId(), e);
        }
    }

    @Override
    public void onError(Throwable t) {
        log.error("IVIOrderObserver.onError", t);
        throw new StatusRuntimeException(Status.UNKNOWN);
    }

    @Override
    public void onCompleted() {
        log.info("IVIOrderObserver stream closed");
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    private void updateOrderConfirmation(String orderId) {
        var request = OrderStatusConfirmRequest.newBuilder()
                .setEnvironmentId(IVIConfiguration.getEnvironmentId())
                .setOrderId(orderId)
                .build();
        streamBlockingStub.orderStatusConfirmation(request);
    }
}
