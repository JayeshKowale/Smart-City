package cpp;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.Vector;
import com.mysql.jdbc.ResultSetMetaData;
public class DB {
	Connection con=null;
	java.sql.PreparedStatement pst;
	public static Connection dbconnect()
	{
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_city","root","");
		return conn;
	}
	catch(Exception e2)
	{
		System.out.println(e2);
	    return null;
	}
	
	}
	
	

}
