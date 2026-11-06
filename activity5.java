import java.util.Scanner;

public class activity5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = ler.nextInt();
        
        int soma = 0;
        int inicio, fim;

        if (numero < 50) {
            inicio = numero;
            fim = 50;
        } else {
            inicio = 50;
            fim = numero;
        }

        for (int i = inicio; i <= fim; i++) {
            soma += i;
        }

        System.out.println("A soma de todos os números entre " + numero + " e 50 é: " + soma);

        ler.close();
    }
}
