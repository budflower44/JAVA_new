package boardJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnectinon {
	private static DataBaseConnectinon dbc = new DataBaseConnectinon();
	private Connection conn = null;
	private String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	private String jdbcUrl = "jdbc:mysql://localhost:3306/javadb";
	private String user = "javaUser";
	private String password = "mysql";
	
	private DataBaseConnectinon() {
		try {
			Class.forName(jdbcDriver);
			conn = DriverManager.getConnection(jdbcUrl, user, password);
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("드라이버를 찾을 수 없습니다.");
		} catch(SQLException e) {
			e.printStackTrace();
			System.out.println("연결정보가 올바르지 않습니다.");
		}
	}
	
	public static DataBaseConnectinon getInstance() {
		return dbc;
	}
	
	public Connection getConnection() {
		return conn;
	}
}
