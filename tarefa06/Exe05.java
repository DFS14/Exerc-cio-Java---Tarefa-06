package tarefa06;
import java.util.Scanner;
public class Exe05 {
public static void main(String[] args) {
		

    Scanner input = new Scanner(System.in);
    
    float a, b, c;
    double delta, raiz1, raiz2;

    System.out.println("Equação do 2o grau: ax² + bx + c = 0");
    System.out.print("Entre com o valor de 'a' (diferente de zero): ");
    a = input.nextFloat();
    if(a == 0) {
        System.out.println("O valor de 'a' deve ser diferente de zero.");
        return;
    }
    System.out.print("Entre com o valor de b: ");
    b = input.nextFloat();
    
    System.out.print("Entre com o valor de c: ");
    c = input.nextFloat();

    delta = Math.pow(b, 2) - (4 * a * c);

    if(delta < 0) {
        System.out.println("Não existem raízes reais, pois delta é negativo.");
    } else {
        raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
        raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.printf("As raízes da equação são: %.2f e %.2f", raiz1, raiz2);
        
        input.close();
    }
}
}
