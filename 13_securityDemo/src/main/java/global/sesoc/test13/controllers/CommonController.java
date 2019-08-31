package global.sesoc.test13.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import global.sesoc.test13.dao.MemberRepository;
import global.sesoc.test13.dto.MemberVO;

@Controller
public class CommonController {

	@Autowired
	MemberRepository repo;
	
	@GetMapping("/accessError")
	public void accessDenied(Authentication auth, Model model) {
		System.out.println("access Denied : " + auth);
		model.addAttribute("msg", "Access Denied");
	}
	
	@GetMapping("/customLogin")
	public void customLogin(String error, String logout, Model model) {
		
		System.out.println("error: " + error);
		System.out.println("logout: " + logout);
		
		if (error != null) {
			model.addAttribute("error", "Login Error Check Your Account");
		}
		
		if (logout != null) {
			model.addAttribute("logout", "Logout!!");
		}
		
		System.out.println("login page");
	}
//	
//	@GetMapping("/customLogout")
//	public void logoutGET() {
//		
//		System.out.println("custom logout");
//	}
	
	@PostMapping("/customLogout")
	public void logoutPost() {
		
		System.out.println("post custom logout");
	}
	
	@GetMapping("/signup")
	public void signupGET() {
		
		System.out.println("signupGET");
	}
	
	
	@PostMapping("/signup")
	public void signupPOST(MemberVO member, String auth) {
		
		System.out.println("signupPOST");
		
		repo.insertOne(member, auth);
	}
	
	
}
