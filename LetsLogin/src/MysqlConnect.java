import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class MysqlConnect {
    
    Connection conn = null;
    
    public static Connection ConnectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver"); //for loading the driver
            
            //establishing connection database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb", "root", "");
            
            //check if database connection is successful
            JOptionPane.showMessageDialog(null, "Connection Successful");
            return conn;
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);    
            return null;
        }
    }
    
}
