package com.company;

import com.company.dao.ProdutoDAO;
import com.company.modelo.Produto;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestaDAODeProduto {

    public static void main(String[] args) throws SQLException {
        Produto mesa = new Produto("Mesa Vermelha", "Mesa com 4 pés");

        try (Connection con = new ConnectionPool().getConnection()) {
            ProdutoDAO dao = new ProdutoDAO(con);
            dao.salva(mesa);

            List<Produto> produtos = dao.lista();
            for (Produto produto : produtos) {
                System.out.println("Existe o produto: " + produto);
            }
        }

    }

}