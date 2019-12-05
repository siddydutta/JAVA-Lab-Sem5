import java.sql.*;
public class DatabaseConnectivity
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver"); // Loads MySQL Driver
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","1234");
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery("select * from student");
			System.out.println("Student Table");
			while(rs.next())
			{
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
