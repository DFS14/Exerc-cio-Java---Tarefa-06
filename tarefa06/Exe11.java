package tarefa06;
import java.util.Scanner;
public class Exe11 {
public static void main(String[] args) {

	 Scanner scanner = new Scanner(System.in);
     System.out.print("Digite um valor inteiro: ");
     int valor = scanner.nextInt();

     if (valor <= 3) {
         System.out.println("O valor digitado é: " + valor);
     } else {
         System.out.println("O valor digitado é maior que três e não será apresentado.");
     }

     scanner.close();
 }

}