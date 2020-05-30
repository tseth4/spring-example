package spring.example.controller;

import org.springframework.stereotype.Controller;

import spring.example.presentation.LoginBean;
import spring.example.service.LoginService;

@Controller
public class LoginController {
	LoginService loginServiceImpl;
	public LoginController(LoginService loginService) {
		loginServiceImpl = loginService;
	}
	
	public boolean validateLogin(LoginBean loginBean) {
		return loginServiceImpl.validateLogin(loginBean);
	}
	
}
