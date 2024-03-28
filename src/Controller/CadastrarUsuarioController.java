package Controller;

import DAO.UsuarioDAO;
import Model.Usuario;
import Views.UserView;

import java.sql.SQLException;

public class CadastrarUsuarioController {
    private UsuarioDAO dao;
    private UserView userView;
    private Usuario usuario;

    public CadastrarUsuarioController() throws SQLException {
        this.userView = new UserView();
        this.usuario = userView.Cadastro();
        dao = new UsuarioDAO();
        dao.inserirUsuario(usuario);
    }
}
