package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import utility.ConnectionProvider;

public class InsertTest {

	public static void main(String[] args) throws SQLException {

		Connection con;
		PreparedStatement ps;
		con = ConnectionProvider.getCon();

		ps = con.prepareStatement("insert into selenium values(?,?)");
		ps.setString(1, "hello");
		ps.setString(2, "world");

		int res = ps.executeUpdate();// will return no of rows in integer
		if (res > 0) {
			System.out.println("Record Inserted");
		} else {
			System.out.println("Unable to insert the record");
		}
	}

}