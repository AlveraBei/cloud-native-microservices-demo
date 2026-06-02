package nl.bei.cloud.userservice;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class UserController {

	@GetMapping("/user")
	public Map<String, Object> getUser() {
    	return Map.of(
            	"id", 1,
            	"name", "Bei",
				"test", "CI/CD is working!"
    	);
	}

	@GetMapping("/health")
	public Map<String, String> health() {
    	return Map.of("status", "ok");
	}
}
