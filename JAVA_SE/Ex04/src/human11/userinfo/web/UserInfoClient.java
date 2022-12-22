package human11.userinfo.web;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import human11.domain.dao.UserInfo;
import human11.domain.dao.UserInfoDao;
import human11.domain.dao.mysql.MySQLDao;
import human11.domain.dao.oracle.OracleDao;

public class UserInfoClient {

	public static void main (String[] args) throws IOException {
		UserInfo uinfo = new UserInfo("human","1234","KANG"); 
		
		FileInputStream fis
			= new FileInputStream
			("D:\\AI_Class\\Tools\\J2SE_FILE\\Ex04\\src"
					+ "\\human11\\userinfo\\web\\conf");
		Properties prop = new Properties();
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
//		String sName = prop.getProperty("name");
//		System.out.println(sName);
		//dbType ==> "Oracle" 또는 "MySQL"
		
		UserInfoDao userInfoDao;
		if(dbType.equals("ORACLE")) {
			//문자열 비교는 ==이렇게 하지 않고, equals로 함.
			userInfoDao = new OracleDao();
			//userInfoDao(인터페이스 객체) = 뒷부분은 인터페이스를 구현한 클래스.
		}
		else {
			userInfoDao = new MySQLDao();
		}
		userInfoDao.insertInfo(uinfo);
		userInfoDao.searchInfo(uinfo);
		userInfoDao.deleteInfo(uinfo);
	}
}