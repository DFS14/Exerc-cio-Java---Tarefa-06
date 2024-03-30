package tarefa06;
import java.util.Scanner;
public class Exe08 {
public static void main(String[] args) {
	
    Scanner input = new Scanner(System.in);

    int maior = Integer.MIN_VALUE;
    int menor = Integer.MAX_VALUE;
    int numero;

    for (int i = 0; i < 5; i++) {
        System.out.print("Digite o número " + (i + 1) + ": ");
        numero = input.nextInt();

        if (numero > maior) {
            maior = numero;
        }
        if (numero < menor) {
            menor = numero;
        }
    }

    System.out.println("O maior número é: " + maior);
    System.out.println("O menor número é: " + menor);

    input.close();
	}
}
