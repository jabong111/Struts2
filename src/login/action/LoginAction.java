package login.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import login.dao.LoginDAO;
import login.interceptor.LoginDAOAware;
import login.model.UserInfo;

public class LoginAction extends ActionSupport implements Preparable, ModelDriven<UserInfo>,LoginDAOAware{

	LoginDAO loginDAO;
	UserInfo userInfo;
	
	@Override
	public void setLoginDAO(LoginDAO loginDAO) {
		this.loginDAO = loginDAO;
	}

	@Override
	public UserInfo getModel() {
		return userInfo;
	}

	@Override
	public void prepare() throws Exception {
		userInfo = new UserInfo();
	}

	@Override
	public String execute() throws Exception {
		if(loginDAO.loginCheck(userInfo)) {
			return SUCCESS;
		}else{
			return LOGIN;
		}
	}
	

}
