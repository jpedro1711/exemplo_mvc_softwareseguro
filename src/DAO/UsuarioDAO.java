package DAO;

import Model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    private Conexao conexao;

    public UsuarioDAO() throws SQLException {
        conexao = Conexao.getInstance();
    }

    public void inserirUsuario(Usuario usuario) {
        try {
            Connection connection = conexao.getConnection();
            String query = "INSERT INTO usuario (nome, senha) VALUES (?, ?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getSenha());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Usuario> getUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        String query = "SELECT * FROM usuario";

        try {
            Connection connection = conexao.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String nome = rs.getString("nome");
                String senha = rs.getString("senha");

                Usuario usuario = new Usuario(nome, senha);
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuarios;
    }
}
