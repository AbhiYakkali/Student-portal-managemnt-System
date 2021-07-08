import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Connections {
    Connection conn=null;
    public static Connection ConnetDB(){
        try{
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/spms","root","root");
            return conn;
        }
        catch(SQLException e){
        JOptionPane.showMessageDialog(null,e);
    }
        return null;
    }
}
