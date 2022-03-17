package br.eti.alexandremartins.irmeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class IrmEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(IrmEurekaServerApplication.class, args);
	}

}
