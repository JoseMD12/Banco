package br.com.alura.jose.data;

import java.sql.Connection;
import java.sql.SQLException;

public class App 
{
    public static void main( String[] args ) throws SQLException{
        
        ConnectionFactory cFactory = new ConnectionFactory();
        Connection connection = cFactory.criaConexao();

        //System.out.println("conectou!");
        Insercao.insere();
        Listagem.lista();
        Remocao.remove();
        Listagem.lista();

        connection.close();
    }
}
