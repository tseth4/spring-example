package spring.example.presentation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.example.configuration.SpringConfig;
import spring.example.controller.LoginController;
import spring.example.dao.LoginDAO;
import spring.example.dao.LoginDAOFileImpl;
import spring.example.service.LoginService;
import spring.example.service.LoginServiceImpl;
public class App {
	static LoginController LoginController;
	public static void main(String[] args) {
		LoginController loginController;
		LoginBean loginBean = new LoginBean();
		loginBean.setUserName("username");
		loginBean.setPassword("password");
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
		loginController = (LoginController) ctx.getBean("loginController");
		boolean result = loginController.validateLogin(loginBean);
		System.out.println(result);
		
//		LoginDAO loginDAO = new LoginDAOFileImpl();
//		LoginService loginService = new LoginServiceImpl(loginDAO);
//		LoginController = new LoginController(loginService);
//		boolean result = LoginController.validateLogin(loginBean);
//		System.out.println(result);
	}

}
