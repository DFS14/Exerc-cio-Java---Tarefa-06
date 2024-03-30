package tarefa06;
import java.util.Scanner;
import java.util.Arrays;
public class Exe06 {

	public static void main(String[] args) {
	
        Scanner input = new Scanner(System.in);
        int[] numeros = {0, 1, 2};
       
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }
        Arrays.sort(numeros); //organizar números em ordem crescente em Java
        
        System.out.println("Valores em ordem crescente: " + numeros[0] + ", " + numeros[1] + ", " + numeros[2]);

        input.close();
    }
}
