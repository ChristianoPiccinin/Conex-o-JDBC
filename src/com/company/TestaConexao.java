package com.company;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

    public static void main(String[] args) throws SQLException {
        ConnectionPool database =  new ConnectionPool();
        Connection connection = database.getConnection();

        System.out.println("Testando a conexao");
        connection.close();

    }
}
