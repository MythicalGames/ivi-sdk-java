package games.mythical.ivi.sdk.client.model;

import games.mythical.ivi.sdk.proto.api.payment.GetCustomerResponse;
import io.netty.util.internal.StringUtil;
import lombok.Builder;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

@Data
@Builder
public class IVICustomer {
    private String customerId;
    private String firstName;
    private String lastName;
    private String email;
    private String address;

    public static IVICustomer fromProto(GetCustomerResponse proto) {
        var customer = IVICustomer.builder()
                .customerId(proto.getCustomerId());

        if(StringUtils.isNotEmpty(proto.getFirstName())) {
            customer.firstName(proto.getFirstName());
        }
        if(StringUtils.isNotEmpty(proto.getLastName())) {
            customer.lastName(proto.getLastName());
        }
        if(StringUtils.isNotEmpty(proto.getEmail())) {
            customer.email(proto.getEmail());
        }
        if(StringUtils.isNotEmpty(proto.getAddress())) {
            customer.address(proto.getAddress());
        }
        return customer.build();
    }
}
