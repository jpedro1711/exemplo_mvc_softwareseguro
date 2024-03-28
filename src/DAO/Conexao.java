package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static Conexao instancia;
    private final String con_banco;
    private final String usuario_mysql;
    private final String senha_mysql;
    private Connection conexao;

    private Conexao() throws SQLException {
        usuario_mysql = "root";
        senha_mysql = "mysqlRoot2023";
        con_banco = "jdbc:mysql://127.0.0.1:3306/db_softwareseguro?useSSL=false";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(con_banco, usuario_mysql, senha_mysql);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Conexao getInstance() throws SQLException {
        if (instancia == null){
            instancia = new Conexao();
        }
        return instancia;
    }

    public Connection getConnection() {
        return conexao;
    }
}
