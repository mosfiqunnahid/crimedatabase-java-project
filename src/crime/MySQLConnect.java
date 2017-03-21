/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crime;

/**
 *
 * @author mita
 */

/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;*/
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class MySQLConnect {

    public static Connection connectDB() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            //database name crime_database
            conn = DriverManager.getConnection("jdbc:mysql://localhost/crime_database", "root", "");
            System.out.print("Database is connected !");
            
            //Statement stt = conn.createStatement();
            return conn;
        } catch (Exception e) {
            System.out.print("Do not connect to DB - Error:" + e);
            return null;
        }
    }
}
