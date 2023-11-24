package pt.nos.ms.requesthandler.objects.auth;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;


@Data
public class AuthenticationResponse {

    @JsonProperty("organization_name")
    private String organizationName;

    @JsonProperty("application_name")
    private String applicationName;

    @JsonProperty("api_product_list")
    private List<String> apiProductList;

    @JsonProperty("token_type")
    private String tokenType;

    @JsonProperty("access_token")
    private String acessToken;

    @JsonProperty("issued_at")
    private String issuedAt;

    @JsonProperty("expires_in")
    private String expiresIn;

    @JsonProperty("status")
    private String status;
}
