package ch48.domain.userinfo.dao.mysql;

import ch48.domain.userinfo.UserInfo;
import ch48.domain.userinfo.dao.UserInfoDAO;

public class UserInfoMysqlDAO implements UserInfoDAO{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Insert into MySQL DB userID = "+ userInfo.getUserID());
		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("update into MySQL DB userID = "+ userInfo.getUserID());
		
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("delete from MySQL DB userID = "+ userInfo.getUserID());
		
	}
	
	

}
