package ch48.domain.userinfo.dao;

import ch48.domain.userinfo.UserInfo;

public interface UserInfoDAO {
	
	void insertUserInfo(UserInfo userInfo);
	void updateUserInfo(UserInfo userInfo);
	void deleteUserInfo(UserInfo userInfo);
	

}
