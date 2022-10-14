package br.com.alura.jose.data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Listagem 
{
    public static void lista() throws SQLException{
        
        ConnectionFactory cFactory = new ConnectionFactory();
        Connection connection = cFactory.criaConexao();

        Statement statement = connection.createStatement();
        statement.execute("SELECT ID, NOME, DESCRICAO FROM PRODUTO"); //boolean

        ResultSet result = statement.getResultSet();

        while(result.next()){
            System.out.println(result.getInt("ID"));
            System.out.println(result.getString("NOME"));
            System.out.println(result.getString("DESCRICAO"));
        }

        connection.close();
    }
}
