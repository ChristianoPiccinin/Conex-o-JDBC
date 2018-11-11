package com.company;

import java.sql.*;

public class TestaInsercao {
    public static void main(String[] args) throws SQLException {
        ConnectionPool database =  new ConnectionPool();


        try (Connection connection = database.getConnection()) {
            String sql = "insert into Produto (nome, descricao) values(?, ?)";

            try(PreparedStatement statement = connection.prepareStatement(sql,
                    Statement.RETURN_GENERATED_KEYS)) {

                adiciona("TV LCD", "32 polegadas", statement);
                adiciona("Blueray", "Full HDMI", statement);
            }

        }

    }

    private static void adiciona(String nome, String descricao, PreparedStatement statement) throws SQLException {
        statement.setString(1,nome);
        statement.setString(2,descricao);

        boolean resultado = statement.execute();

        ResultSet resultSet = statement.getGeneratedKeys();
        while (resultSet.next()){
            String id = resultSet.getString("id");
            System.out.println("codigo inserido " + id + " produto " + nome );

        }

        resultSet.close();
    }
}
