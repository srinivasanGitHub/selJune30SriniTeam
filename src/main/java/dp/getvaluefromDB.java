package dp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;



public class getvaluefromDB {
	
	static final  String java_driver = "com.mysql.jdbc.Driver";
	static final String url="jdbc:mysql://13.232.180.35:3306/opentaps";
	
	static final String userName="dbuser";
	static final String passWord="test@123";

	public static void main(String[] args) throws ClassNotFoundException {
		
		Connection conn=null;
		Statement stmt=null;
		
		try {
			Class.forName(java_driver);
			conn =DriverManager.getConnection(url, userName, passWord);
			stmt =conn.createStatement();
			
			String sqlQuery ="SELECT * FROM OPENTAPS.PERSON WHERE PARTY_ID = 10060";
			ResultSet resSet = stmt.executeQuery(sqlQuery);
			ResultSetMetaData resSetMD = resSet.getMetaData();
			int columnsCount= resSetMD.getColumnCount();
			
			while( resSet.next())
			{
				 for(int i = 1; i < columnsCount; i++)
				 {
					 	System.out.print(resSetMD.getColumnName(i) + " ");
				        System.out.println(resSet.getString(i) + " ");
				       
				 }
				    
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		

		
		
		

	}

}
