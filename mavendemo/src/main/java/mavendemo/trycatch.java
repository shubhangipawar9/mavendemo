package mavendemo;

import java.sql.Connection;
import java.sql.DriverManager;

public class trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe","system" ,"manager");
		System.out.println("Connection Established ");		


	}	
		catch(Exception e) 
		{
			System.err.println(e);
		}
	}
}
