import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Exibindo mensagem olá turma - atalho(sout)

        /*
        System.out.println("Olá turma");

        int idade = 23;
        String nome = "Matheus A";

        System.out.println("Nome: " + nome + "\nIdade: " + (idade + 1));
         */

        Scanner scanner = new Scanner(System.in);

        // atalho (souf)
        System.out.printf("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.printf("Seu nome é: " + nome);
    }
}