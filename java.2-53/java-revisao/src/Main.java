import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Exibindo primeira mensagem - atalho(sout)

        /*
        System.out.println("Hello World!");

        int idade = 23;
        String nome = "Matheus Araujo";

        System.out.println("Nome: " + nome + "\nIdade: " + idade);
        */

        Scanner scanner = new Scanner(System.in);

        /*
        System.out.printf("Digite o seu nome: \n");
        String nome = scanner.nextLine();

        System.out.printf("Digite sua idade: \n");
        int idade = scanner.nextInt();

        System.out.printf("Digite sua altura: \n");
        double altura = scanner.nextDouble();

        System.out.println("Nome: " + nome +
                "\nIdade: " + idade + "\nAltura: " + altura
        );

         */
        int palmas = 0;
        while (palmas < 10) {
            if(palmas == 1) {
                break;
            }

            System.out.println("Clap - " + (palmas + 1));

            if(palmas == 7) {
                System.out.println("Minhas mãos doem!");
            }

            palmas++;
        }
    }
}