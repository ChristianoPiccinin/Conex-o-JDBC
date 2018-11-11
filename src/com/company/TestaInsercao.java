package com.company;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {
    public static void main(String[] args) throws SQLException {
        Connection connection = Database.getConnection();

        Statement stantement = connection.createStatement();

        connection.close();
    }
}
