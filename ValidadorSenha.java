
 import java.util.Scanner;

public class ValidadorSenha {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double senhaCorreta = 1234;

        System.out.println("Digite a senha: ");
        

        double senhaDigitada = scanner.nextDouble();

        if ((senhaCorreta == senhaDigitada)) {
            System.out.println("Acesso Permitido");
        } else {
            System.out.println("Acesso Negado");
        }


    }
}