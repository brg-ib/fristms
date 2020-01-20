package ynov.app1.fristms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FristmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FristmsApplication.class, args);
	}

}
