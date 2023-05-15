
package dbprogramming1;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;


public class LAB13 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://127.0.0.1:3306/mydb1";
        String username = "root";
        String password = "Teamsy2346";
       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection(URL, username, password);
            String sql = "UPDATE student SET ?' "
                    + "WHERE studentID='?";
            PreparedStatement Statement= connection.prepareStatement(sql);
            Statement.setString(1,"xxxzzz@gmail.com");
            Statement.setInt(2,111111);
            Statement.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB13.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB13.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
