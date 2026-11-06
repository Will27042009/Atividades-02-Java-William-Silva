import java.util.Scanner;

public class activity4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número para ver a sua tabuada: ");
        int numero = ler.nextInt();

        System.out.println("\nTabuada de " + numero + ":");
       
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        ler.close(); 
    }
}
