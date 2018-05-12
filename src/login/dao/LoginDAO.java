package login.dao;

import login.model.UserInfo;

public class LoginDAO {
	public boolean loginCheck(UserInfo userInfo) {
		if("test".equals(userInfo.getId())) {
			userInfo.setName("ȫ�浿");
			return true;
		}else{
			return false;
		}
	}

}
