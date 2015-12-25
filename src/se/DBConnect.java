package se;

import java.sql.* ;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ashutosh
 */
public class DBConnect 
{
    static Connection c ;
    static Statement st ;
    static
    {
        try 
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ashuthesmartest","ashutosha");
            st=c.createStatement();
        } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(null, "Database error");
        }
    }   
}
