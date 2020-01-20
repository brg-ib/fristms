package ynov.app1.firstms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FirstmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstmsApplication.class, args);
	}

}
