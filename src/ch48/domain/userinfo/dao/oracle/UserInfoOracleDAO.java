package ch48.domain.userinfo.dao.oracle;

import ch48.domain.userinfo.UserInfo;
import ch48.domain.userinfo.dao.UserInfoDAO;

public class UserInfoOracleDAO implements UserInfoDAO {

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Insert into ORACLE DB userID = "+ userInfo.getUserID());
		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("Update into ORACLE DB userID = "+ userInfo.getUserID());
		
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("Delete from ORACLE DB userID = "+ userInfo.getUserID());
		
	}

}
