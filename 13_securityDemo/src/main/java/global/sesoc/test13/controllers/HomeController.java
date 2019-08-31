package global.sesoc.test13.controllers;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home(Locale locale, Model model) {
		
		return "redirect:/sample/all";
	}
	
}
