package nl.bei.cloud.orderservice;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
public class OrderController {

	@GetMapping("/orders")
	public Map<String, Object> getOrder() {

    	RestTemplate restTemplate = new RestTemplate();

    	// 调用 user-service 
    	Map user = restTemplate.getForObject(
            	"https://cloud-user-service-gbpz.onrender.com/user",
            	Map.class
    	);

    	return Map.of(
            	"orderId", 101,
            	"user", user
    	);
	}
}
