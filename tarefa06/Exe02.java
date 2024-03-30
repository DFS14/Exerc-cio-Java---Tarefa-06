package tarefa06;
import java.util.Scanner;
public class Exe02 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
    
System.out.print("Digite um valor inteiro (positivo ou negativo): ");

int numero = scanner.nextInt();
int valorPositivo = numero < 0 ? numero * -1 : numero;


System.out.println("O módulo do número fornecido é: " + valorPositivo);
	
	
	scanner.close();
	
	}

}
