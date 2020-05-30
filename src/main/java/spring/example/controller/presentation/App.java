package spring.example.controller.presentation;
import spring.example.controller.LoginController;
import spring.example.dao.LoginDAO;
import spring.example.dao.LoginDAOFileImpl;
import spring.example.service.LoginService;
import spring.example.service.LoginServiceImpl;
public class App {
	static LoginController LoginController;
	public static void main(String[] args) {
		LoginBean loginBean = new LoginBean();
		loginBean.setUserName("username");
		loginBean.setPassword("password");
		
		LoginDAO loginDAO = new LoginDAOFileImpl();
		LoginService loginService = new LoginServiceImpl(loginDAO);
		LoginController = new LoginController(loginService);
		boolean result = LoginController.validateLogin(loginBean);
		System.out.println(result);
	}

}
