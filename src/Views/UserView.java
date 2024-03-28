package Views;

import Model.Usuario;

import java.util.List;
import java.util.Scanner;

public class UserView {
    private Scanner sc;
    public UserView() {
        sc = new Scanner(System.in);
    }
    public void ExibirUsuarios(List<Usuario> data)
    {
        for ( Usuario u : data ) {
            System.out.println(u);
        }
    }

    public Usuario Cadastro()
    {
        System.out.println("Nome: ");
        String nome = sc.nextLine();
        System.out.println("Senha: ");
        String senha = sc.nextLine();

        return new Usuario(nome, senha);
    }
}
