package pt.nos.ms.requesthandler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class RequestHandlerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RequestHandlerApplication.class, args);
	}

}
