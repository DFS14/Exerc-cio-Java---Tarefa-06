package tarefa06;
import java.util.Scanner;
public class Exe07 {
public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] numeros = {1,2,3,4};


		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite o número " + (i + 1) + ": ");
			numeros[i] = input.nextInt();
		}

		System.out.println("Números divisíveis por 2 e 3:");
		for (int numero : numeros) 
		{
			if (numero % 2 == 0 && numero % 3 == 0) {
				System.out.println(numero);
		}
	}
		input.close();
	}
}
