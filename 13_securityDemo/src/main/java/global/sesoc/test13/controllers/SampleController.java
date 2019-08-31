package global.sesoc.test13.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/sample/")
@Controller
public class SampleController {

	@GetMapping("/all")
	public void doAll() {
		
		System.out.println("do all can access everybody");
	}
	
	@GetMapping("/member")
	public void doMember() {
		
		System.out.println("logined member");
	}
	
	@GetMapping("/admin")
	public void doAdmin() {
		
		System.out.println("admin only");
	}

}
