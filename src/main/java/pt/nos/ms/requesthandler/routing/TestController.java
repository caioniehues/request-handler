package pt.nos.ms.requesthandler.routing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.nos.ms.requesthandler.objects.auth.AuthenticationRequest;

@RestController
public class TestController {

    private final AuthenticationRequest authenticationRequest;


    public TestController(AuthenticationRequest authenticationRequest) {
        this.authenticationRequest = authenticationRequest;
    }


    @GetMapping("/")
    public String authTest() throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();

        return objectMapper.writeValueAsString(authenticationRequest);
    }
}
