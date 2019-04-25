package utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	
	static Connection con=null;
	public static Connection getCon()
	{
		try{

			Class.forName("oracle.jdbc.driver.OracleDriver");//driver load
			con=DriverManager.getConnection//connection build with database
					("jdbc:oracle:thin:@localhost:1521:oracle", "HR", "hr");
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		return con;
	}
	

}