package com.luizapereira.coreengineering.tema10.persistence;

import com.luizapereira.coreengineering.tema10.exceptions.ConnectionException;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection {

    public static Connection openConnection() {
        Properties props = new Properties();
        try {
            props.load(new FileInputStream("db.properties"));
            String url = props.getProperty("dburl");
            String user = props.getProperty("user");
            String password = props.getProperty("password");
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException | IOException e) {
            throw new ConnectionException("Could not open connection!");
        }
    }
}