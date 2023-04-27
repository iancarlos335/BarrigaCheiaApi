package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mydatabase", "root", "mypassword");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}