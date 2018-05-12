package login.interceptor;

import login.dao.LoginDAO;
import login.model.UserInfo;

public interface LoginDAOAware {
	public void setLoginDAO(LoginDAO loginDAO);
}
