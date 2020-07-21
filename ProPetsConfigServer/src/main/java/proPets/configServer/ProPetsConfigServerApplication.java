package proPets.configServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableDiscoveryClient
@SpringBootApplication
@EnableConfigServer
public class ProPetsConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProPetsConfigServerApplication.class, args);
	}

}
