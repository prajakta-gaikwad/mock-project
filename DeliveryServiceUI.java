package userInterface;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeliveryServiceUI {
	
	@GetMapping("/")
	public String showFirstScreen() {
		return "index";
	}
	
	@GetMapping("/notifications")
	public String showNotificationsScreen() {
		return "notifications";
	}
}
