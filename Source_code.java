package program;
import java.sql.*;
import java.util.*;
public class Source_code {
	public static void main(String[] args){
		try {
		Scanner sc=new Scanner(System.in);
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin"); 
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from student");
		if(rs.next()) {
				System.out.println(rs);
			
		}
		
		
		
		
		
		
		
		
		con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
}
}
