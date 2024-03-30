package tarefa06;
import java.util.Scanner;
public class Exe04 {
public static void main(String[] args) {
	
Scanner scanner = new Scanner(System.in);

int somaDasNotas = 0;
int numeroDeNotas = 4;

for (int i = 1; i <=numeroDeNotas; i++) {
	System.out.println("Digite a nota" + i + ": ");
	somaDasNotas += scanner.nextInt();
}
int media = somaDasNotas/numeroDeNotas;

if(media >= 7) {
	System.out.println("O aluno foi aprovado com média: " + media);
}
else
{
System.out.println("Digite a nota do exame: ");
int notaExame = scanner.nextInt();
int novaMedia = (media + notaExame)/2;


if(novaMedia >= 5) {
	System.out.println("O aluno foi aprovado em exame com média: " + novaMedia);
}
else
	
{
	System.out.println("O aluno não foi aprovado. Média após exame: " + novaMedia);

	
scanner.close();	
	}
   }
  }
}



