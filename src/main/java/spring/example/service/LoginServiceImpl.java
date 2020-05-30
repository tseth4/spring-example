package spring.example.service;

import org.springframework.stereotype.Service;

import spring.example.dao.LoginDAO;
import spring.example.presentation.LoginBean;

@Service
public class LoginServiceImpl implements LoginService {
	LoginDAO loginDAOFileImpl;
	
	public LoginServiceImpl(LoginDAO loginDAO) {
		loginDAOFileImpl = loginDAO;
	}
	
	public boolean validateLogin(LoginBean loginBean) {
		return loginDAOFileImpl.validateLogin(loginBean);
	}

}
