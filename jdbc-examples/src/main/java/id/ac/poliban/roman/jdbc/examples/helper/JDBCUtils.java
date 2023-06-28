/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.poliban.roman.jdbc.examples.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author roman
 */
public class JDBCUtils {
    public static Connection getMySQLConnection() throws SQLException{
        String url = "jdbc:mysql://localhost:3306/testing?user=root&password=1234";
        return DriverManager.getConnection(url);
    }
}
