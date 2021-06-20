import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;/*/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class baglantim {
    private static  final String USER="root";
    private static  final String PASS="01A06m0550alp.";
    private static final String DB_URL="jdbc:mysql://localhost:3306/sorubanka_database?useTimezone=true&serverTimezone=UTC";
    //Class.forName("com.mysql.cj.jdbc.Driver");
    public static void main(String[]args)
    {
        Connection con=null;
        try{
            
        con=DriverManager.getConnection(DB_URL,USER,PASS);
        System.out.println("connected!");
        Statement stmt=(Statement) con.createStatement();
        
        
        }catch(SQLException e)
        {
            System.err.println(e);
        }
        
    }
    
    
}
