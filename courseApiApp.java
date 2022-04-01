package io.springboot.quickstart;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
class courseApiApp {

	public static void main(String[] args) {
		
		SpringApplication.run(courseApiApp.class,args);
	}

}
