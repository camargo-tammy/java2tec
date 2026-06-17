
    import java.util.Scanner;
public class calculaDesconto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        double valor = scanner.nextDouble();

        double desconto = 0;

        if (valor > 200) {
            desconto = valor * 0.20;
        } else if (valor > 100) {
            desconto = valor * 0.10;
        }

        double valorFinal = valor - desconto;

        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Valor final: R$ " + valorFinal);

    }
}

