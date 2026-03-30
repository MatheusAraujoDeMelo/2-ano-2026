import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Exibir mensagem - atalho (sout)
        System.out.println("Primeiro print do ano");

        /*
        int idade = 23;
        String nome = "Matheus";

        System.out.println("Idade: " + idade + " e meu nome é " + nome);
         */

        Scanner ler = new Scanner(System.in);

        System.out.printf("Digite sua idade: ");
        int idade = ler.nextInt();

        System.out.printf("Digite seu nome: ");
        String nome = ler.next();

        System.out.printf("Digite sua altura: ");
        double altura = ler.nextDouble();

        System.out.printf("Seu nome é: " + nome + ", sua idade é: " + idade +*++ " e sua altura é: " + altura);

    }
}