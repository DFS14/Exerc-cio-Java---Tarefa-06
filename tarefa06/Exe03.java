package tarefa06;
import java.util.Scanner;
public class Exe03 {

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int somaDasNotas = 0;
    int numeroDeNotas = 4;

    
    for (int i = 1; i <= numeroDeNotas; i++) {
        System.out.print("Digite a nota " + i + ": ");
        somaDasNotas += scanner.nextDouble();
    }

   
    float media = somaDasNotas / numeroDeNotas;

    if (media >= 5) {
        System.out.println("O aluno foi aprovado com média: " + media);
    } else {
        System.out.println("O aluno não foi aprovado. Média: " + media);
    }

		
scanner.close();
}
}

