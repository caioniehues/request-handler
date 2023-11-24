package pt.nos.ms.requesthandler.objects.auth;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class AuthenticationRequest {

    @Value("${apigee.auth.key}")
    private String key;

    @Value("${apigee.auth.secret}")
    private String secret;

}
