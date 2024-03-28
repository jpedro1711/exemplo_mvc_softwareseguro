package Views;

import java.util.Scanner;

public class MenuView {
    private Scanner sc;

    public MenuView() {
        this.sc = new Scanner(System.in);
    }

    public int TelaMenu() {
        System.out.println("1 - Cadastrar usuário");
        System.out.println("2 - Listar usuários");
        System.out.println("3 - Sair");
        System.out.println("Digite uma opção:");
        int op = sc.nextInt();
        return op;
    }

    public void opcaoInvalida() {
        System.out.println("Opção inválida");
    }
}
