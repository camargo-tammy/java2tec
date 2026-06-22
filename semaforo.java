import java.util.Scanner;

public class semaforo {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
      

        System.out.println("Digite uma cor (Verde, Amarelo ou Vermelho): ");
        String cor = scanner.nextLine();
        System.out.println(cor);
        if (cor.equals( "Verde")) {
            System.out.println("Siga");
        } else if (cor.equals("Amarelo")) {
            System.out.println("Atenção");
        } else if (cor.equals ("Vermelho")) {
            System.out.println("Pare");
        } else {
            System.out.println("Cor inválida");
        }

        
    }
}