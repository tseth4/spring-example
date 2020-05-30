package spring.example.dao;

import org.springframework.stereotype.Repository;

import spring.example.presentation.LoginBean;

@Repository
public class LoginDAOFileImpl implements LoginDAO {
	
	public boolean validateLogin(LoginBean loginBean) {
		if(loginBean.getUserName().contentEquals("username") && loginBean.getPassword().contentEquals("password")) {
			return true;
		}
		return false;
	}

}
