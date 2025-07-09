package sesame.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Dockerex1Application {

	public static void main(String[] args) {
		SpringApplication.run(Dockerex1Application.class, args);
	}
	@GetMapping("/test")
	public String hello() {
		return "Hello World";
	}
}
