package pe.com.entelgy.jsonrefactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class JsonRefactoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonRefactoryApplication.class, args);
	}

}
