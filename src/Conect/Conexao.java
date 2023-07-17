package Conect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    Connection conn;

    public boolean conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/leilao", "root", "thiago1206");
            return true;
        } catch (Exception e) {
            throw new RuntimeException("uncaught", e);
        }      
    }

    public Connection getConexao() {
        return conn;
    }

    public void desconectar() {
        try {
            conn.close();
        } catch (SQLException ex) {
        }
    }
}
