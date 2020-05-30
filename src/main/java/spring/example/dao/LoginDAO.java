package spring.example.dao;

import spring.example.presentation.LoginBean;

public interface LoginDAO {

	public boolean validateLogin(LoginBean loginBean);

}
