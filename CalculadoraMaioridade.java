import java.util.Scanner;

public class CalculadoraMaioridade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        int idade = 2026 - anoNascimento;

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }

        
    }
}