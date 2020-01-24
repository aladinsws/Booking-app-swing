/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connexion {
    
public static Connection ConnecrDb(){
try {
Class.forName("com.mysql.jdbc.Driver");
    Connection cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel?zeroDateTimeBehavior=convertToNull", "root", "");
return cnx;
} catch (Exception e) {
System.out.println("Exception = " + e);
}
    return null;
    
}

   
}
