import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        int menu;

        do {
            System.out.println("\n\nAdministrador de Pet Shop");
            System.out.println("Digite [1] para Cadastrar um Cachorro\nDigite [2] para Cadastrar um Gato\nDigite [0] para SAIR");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Informe o nome do cachorro:");
                    cachorro.setNome(sc1.nextLine());
                    System.out.println("Informe a raça do cachorro:");
                    cachorro.setRaca(sc1.nextLine());
                    cachorro.caminha();
                    cachorro.late();
                    break;
                case 2:
                    System.out.println("Informe o nome do gato:");
                    gato.setNome(sc1.nextLine());
                    System.out.println("Informe a raça do gato:");
                    gato.setRaca(sc1.nextLine());
                    gato.caminha();
                    gato.mia();
                    break;
                case 0:
                    System.out.println("Você escolheu SAIR. Até mais!");
            }
        } while (menu != 0);
    }
}