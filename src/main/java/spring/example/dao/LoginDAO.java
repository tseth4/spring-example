package spring.example.dao;

import spring.example.controller.presentation.LoginBean;

public interface LoginDAO {

	public boolean validateLogin(LoginBean loginBean);

}
