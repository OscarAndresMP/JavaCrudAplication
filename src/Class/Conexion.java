/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author teddd
 */
public class Conexion {
    Connection conn;
    
    public Connection connection(){
          try {
            
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/JavaCrud", "root", "");
            
            System.out.println("Connection");
        } catch (Exception e) {
            System.err.println(e);
        }
          return conn;
    }
}
