package spring.example.service;

import spring.example.controller.presentation.LoginBean;
import spring.example.dao.LoginDAO;

public class LoginServiceImpl implements LoginService {
	LoginDAO loginDAOFileImpl;
	
	public LoginServiceImpl(LoginDAO loginDAO) {
		loginDAOFileImpl = loginDAO;
	}
	
	public boolean validateLogin(LoginBean loginBean) {
		return loginDAOFileImpl.validateLogin(loginBean);
	}

}
