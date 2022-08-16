package games.mythical.ivi.sdk.client.model;

import games.mythical.ivi.sdk.proto.api.payment.GetCustomerResponse;
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
    // this as to be added here for the front end to be able to get the data if it's available because it's required by the embed
    private String gr4vyBuyerId;

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
        // I know casing for gr4vy is wrong, its just how it's converted during the proto build
        if(StringUtils.isNotEmpty(proto.getGr4VyBuyerId())) {
            customer.gr4vyBuyerId(proto.getGr4VyBuyerId());
        }
        return customer.build();
    }
}
