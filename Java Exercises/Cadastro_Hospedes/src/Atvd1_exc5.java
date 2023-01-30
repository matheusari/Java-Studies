import java.util.Scanner;

public class Atvd1_exc5
{

 public static void main(String[] args) 
 {

   Scanner scanner = new Scanner(System.in);

   int[][] quartos = new int[4][3]; // Matriz que armazena os quartos do hotel

   int[] quartos_ocupados = new int[100]; // Vetor que armazena os quartos ocupados

   int num_quartos_ocupados = 0; // Número de quartos ocupados

   char opcao; // Opção do usuário

   // Laço que lê os quartos ocupados

   do {

     System.out.print("Informe o andar do quarto ocupado: ");

     int andar = scanner.nextInt();

     System.out.print("Informe o número do quarto ocupado: ");

     int numero = scanner.nextInt();

     quartos[andar - 1][numero - 1] = 1; // Marca o quarto como ocupado

     quartos_ocupados[num_quartos_ocupados] = andar * 100 + numero; // Adiciona o quarto ocupado ao vetor

     num_quartos_ocupados++; // Incrementa o número de quartos ocupados

     System.out.print("Deseja informar outra ocupação? (S/N) ");

     opcao = scanner.next().charAt(0);

   } while (opcao == 'S' || opcao == 's');

   // Imprime a tabela de quartos

               
    }
   }
        
