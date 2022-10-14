package br.com.alura.jose.data;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Remocao {
    
    public static void remove() throws SQLException {

        ConnectionFactory cFactory = new ConnectionFactory();
        Connection connection = cFactory.criaConexao();

        Statement statement = connection.createStatement();
        statement.execute("DELETE FROM PRODUTO WHERE ID > 1");

        int linhasModificadas = statement.getUpdateCount();
        System.out.println(linhasModificadas);
    }
}
