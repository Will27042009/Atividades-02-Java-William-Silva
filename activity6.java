import java.util.Scanner;

public class activity6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = ler.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = ler.nextInt();

        int inicio = Math.min(num1, num2);
        int fim = Math.max(num1, num2);

        int soma = 0;

        for (int i = inicio; i <= fim; i++) {
            soma += i;
        }

        System.out.println("A soma de todos os números entre " + inicio + " e " + fim + " é: " + soma);

        ler.close();
    }
}
