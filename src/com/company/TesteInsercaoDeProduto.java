package com.company;

import com.company.modelo.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class TesteInsercaoDeProduto {

    public static void main(String[] args) throws SQLException{
        Produto mesa = new Produto("Mesa Azul", "Mesa com 4 pés");

        try (Connection con = new ConnectionPool().getConnection()){
            String sql = "insert into Produto (nome, descricao) values (?,?)";

            try (PreparedStatement stmt = con.prepareStatement(sql,
                                          Statement.RETURN_GENERATED_KEYS)){
                stmt.setString(1, mesa.getNome());
                stmt.setString(2, mesa.getDescricao());
                stmt.execute();

            }

        }


    }
}