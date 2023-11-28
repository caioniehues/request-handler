package pt.nos.ms.requesthandler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class RequestHandlerApplication {

	@Value("${NAME:World}")
	String name;

	@RestController
	class HelloworldController {
		@GetMapping("/")
		String hello() {
			return "Hello " + name + "!";
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(RequestHandlerApplication.class, args);
	}

}
