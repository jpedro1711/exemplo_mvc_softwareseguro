package Controller;

import Views.MenuView;

import java.sql.SQLException;

public class MenuController {
    private MenuView menuView;
    private CadastrarUsuarioController cadastrarUsuarioController;
    private ListarUsuarioController listarUsuarioController;
    private int opcao;


    public MenuController() throws SQLException {
        menuView = new MenuView();
        this.opcao = 0;
        while (this.opcao != 9)
        {
            this.opcao = menuView.TelaMenu();

            if (opcao == 1)
            {
                cadastrarUsuarioController = new CadastrarUsuarioController();
            }
            if (opcao == 2)
            {
                listarUsuarioController = new ListarUsuarioController();
            }
            if (opcao == 3)
            {
                opcao = 9;
            }
            else
            {
                menuView.opcaoInvalida();
            }
        }
    }
}
