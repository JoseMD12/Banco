package br.com.alura.jose.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    
    public Connection criaConexao() throws SQLException{
        Connection connection = DriverManager
        .getConnection
        ("jdbc:mysql://localhost/loja_virtual?useTimeZone=true&serverTimeZone=UTC", "root"
        , "Josehmd@061202");
        
        return connection;
    }
}
