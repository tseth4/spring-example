package spring.example.controller;

import spring.example.controller.presentation.LoginBean;
import spring.example.service.LoginService;

public class LoginController {
	LoginService loginServiceImpl;
	public LoginController(LoginService loginService) {
		loginServiceImpl = loginService;
	}
	
	public boolean validateLogin(LoginBean loginBean) {
		return loginServiceImpl.validateLogin(loginBean);
	}
	
}
