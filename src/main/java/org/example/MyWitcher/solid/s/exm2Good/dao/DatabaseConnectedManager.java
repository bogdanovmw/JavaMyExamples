package org.example.MyWitcher.solid.s.exm2Good.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectedManager {
    private Connection connection;

    private static DatabaseConnectedManager connectedManager = new DatabaseConnectedManager();

    private DatabaseConnectedManager() {}

    public void connect() throws SQLException {
        connection = DriverManager.getConnection("Database URL");
        System.out.println("Connection to DB = true!");
    }

    public void disconnect() throws SQLException {
        connection.close();
        System.out.println("Disconnected from DB!");

    }

    public Connection getConnection() {
        return connection;
    }
}
