package JDBC;
import java.beans.Statement;
import java.sql.*;

class ConnectionTOJDBC{
public static void main(String[] args) throws Exception  {
   try {
    Class.forName("oracle.jdbc.OracleDriver");   // class loader
    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "mk", "123");
    String qry ="Select * from DEMO";
    PreparedStatement st = (PreparedStatement)con.prepareStatement(qry);
    ResultSet rs =st.executeQuery(qry);
    while (rs.next()) {
        System.out.println(rs.getString("name")+"       "+rs.getString("MOB"));
       
    }
   
   }
   catch (ClassNotFoundException e) {
    System.out.println("conn not done class not found------>" + e.getMessage());
} catch (SQLException e) {
    System.out.println("conn not done------>" + e.getMessage());
}
  

}
}