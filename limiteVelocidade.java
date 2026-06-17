import java.util.Scanner;

public class limiteVelocidade {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

         double velocidade = scanner.nextDouble();

        System.out.println("Digite a velocidade percorrida: ");
        if ((velocidade > 80 )) {
            System.out.println("Você foi multado!");
        } else {
            System.out.println("Boa viagem!");
        }

    }
}
