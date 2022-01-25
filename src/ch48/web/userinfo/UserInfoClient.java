package ch48.web.userinfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import ch48.domain.userinfo.UserInfo;
import ch48.domain.userinfo.dao.UserInfoDAO;
import ch48.domain.userinfo.dao.mysql.UserInfoMysqlDAO;
import ch48.domain.userinfo.dao.oracle.UserInfoOracleDAO;

public class UserInfoClient {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("db.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserID("12345");
		userInfo.setPw("!@#$");
		userInfo.setUserName("Lee");
		
		UserInfoDAO userInfoDAO = null;
		
		if(dbType.equals("ORACLE")) {
			userInfoDAO=new UserInfoOracleDAO();
		}else if(dbType.equals("MYSQL")) {
			userInfoDAO=new UserInfoMysqlDAO();
		}else {
			System.out.println("db ERROR");
			return;
		}
		
		userInfoDAO.insertUserInfo(userInfo);
		userInfoDAO.updateUserInfo(userInfo);
		userInfoDAO.deleteUserInfo(userInfo);
		
	}

}
