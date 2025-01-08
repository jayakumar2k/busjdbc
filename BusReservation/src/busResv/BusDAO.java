package busResv;

import java.sql.*;

public class BusDAO {
	
	public void displayBusInfo() throws SQLException{
		String query="select * from bus";
		
		Connection con =DbConnection.getConnection();
		
		Statement st= con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next()) {
				System.out.println("Bus No: "+ rs.getInt(1));
				if(rs.getString(2).equals("true")) {
					System.out.println("Ac: Yes");
				}
				else {
					System.out.println("Ac: No");
				}
				
				System.out.println("Capacity:"+rs.getInt(3));
				System.out.println("Price:"+rs.getInt(4));
				System.out.println("-------------------------------------------------------------");
			}
		}
	
	public int getCapacity(int id) throws SQLException{
		String query="select bcapacity from bus where bid="+ id;
		Connection con= DbConnection.getConnection();
		Statement st= con.createStatement();
		ResultSet rs= st.executeQuery(query);
		
		rs.next();
		return rs.getInt(1);
	}
	
	

}

