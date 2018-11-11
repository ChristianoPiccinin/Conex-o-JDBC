# Conexão JDBC Java

## Classe de Conexão
´´´java

package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    static Connection getConnection() throws SQLException{
        /*** endereço do banco de dados, usuario, senha ***/
	Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/loja-virtual", "SA", "");
        return  connection;
    }

}




´´´

## Classe de Listagem
´´´java


´´´
## Classe de Inserção
´´´java


´´´

## Classe de Remoção
´´´java


´´´
