package tarefa06;
import java.util.Scanner;
public class Exe01 {
public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o primeiro valor inteiro: ");
		int valor1 = scanner.nextInt();
		
		System.out.print("Digite o segundo valor inteiro: ");
		int valor2 = scanner.nextInt();

		int diferenca = Math.abs(valor1 - valor2);
		System.out.println("A diferença do maior pelo menor valor é: " + diferenca);

		scanner.close();   
	
	}
}