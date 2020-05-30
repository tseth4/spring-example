package spring.example.dao;

import spring.example.controller.presentation.LoginBean;

public class LoginDAOFileImpl implements LoginDAO {
	
	public boolean validateLogin(LoginBean loginBean) {
		if(loginBean.getUserName().contentEquals("username") && loginBean.getPassword().contentEquals("password")) {
			return true;
		}
		return false;
	}

}
