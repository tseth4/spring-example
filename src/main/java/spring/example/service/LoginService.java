package spring.example.service;

import spring.example.controller.presentation.LoginBean;

public interface LoginService {
	public boolean validateLogin(LoginBean loginBean);
}
