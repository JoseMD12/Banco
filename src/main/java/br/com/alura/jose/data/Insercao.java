package br.com.alura.jose.data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Insercao 
{
    public static void insere() throws SQLException{
        
        ConnectionFactory cFactory = new ConnectionFactory();
        Connection connection = cFactory.criaConexao();

        //System.out.println("conectou!");

        Statement statement = connection.createStatement();
        statement.execute("INSERT INTO PRODUTO (NOME, DESCRICAO) VALUES ('IPhone 14', 'Midnight')",
                Statement.RETURN_GENERATED_KEYS); 

        ResultSet result = statement.getGeneratedKeys();

        while(result.next()){
            result.getInt(1);
        }

        connection.close();
    }
}
