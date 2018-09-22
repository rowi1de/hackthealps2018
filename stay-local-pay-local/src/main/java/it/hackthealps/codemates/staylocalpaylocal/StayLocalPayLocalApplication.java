package it.hackthealps.codemates.staylocalpaylocal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class StayLocalPayLocalApplication {

	public static void main(String[] args) {
		SpringApplication.run(StayLocalPayLocalApplication.class, args);
	}

}
