package in.kapour.config.ConfigClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClientApplication {

	@Value("${user.role:norole}")
	private String role;

	@Value("${user.password:nopass}")
	private String password;

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

	@GetMapping("/whatsmyrole")
	public String getUserRole() {
		return "Your role is " + role + " and the password is " + password;
	}
}
