package busResv;
import java.util.Date;
import java.sql.*;

public class BookingDAO {

	public int getBookedCount(int id,Date date) throws SQLException{
		Connection con =DbConnection.getConnection();
		
		String query="select count(passenger_name) from booking where bus_no=? and travel_date=?";
		PreparedStatement pst= con.prepareStatement(query);
		java.sql.Date sqldate= new java.sql.Date(date.getTime());
		pst.setInt(1, id);
		pst.setDate(2, sqldate);
		
		ResultSet rs=pst.executeQuery();
		rs.next();
		return rs.getInt(1);
	}
	
	public void addBooking(Booking booking) throws SQLException{
		Connection con =DbConnection.getConnection();
		
		String query="Insert into booking values(?,?,?)";
		PreparedStatement pst= con.prepareStatement(query);
		java.sql.Date sqldate= new java.sql.Date(booking.date.getTime());
		pst.setString(1, booking.passengerName);
		pst.setInt(2, booking.busNo);
		pst.setDate(3, sqldate);
		
		pst.executeUpdate();
		
		
		
	}
}
