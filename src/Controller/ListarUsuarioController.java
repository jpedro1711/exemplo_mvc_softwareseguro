package Controller;

import DAO.UsuarioDAO;
import Model.Usuario;
import Views.UserView;

import java.sql.SQLException;

public class ListarUsuarioController {
    private UsuarioDAO dao;
    private UserView userView;
    private Usuario usuario;

    public ListarUsuarioController() throws SQLException {
        this.dao = new UsuarioDAO();
        this.userView = new UserView();
        userView.ExibirUsuarios(dao.getUsuarios());
    }
}
