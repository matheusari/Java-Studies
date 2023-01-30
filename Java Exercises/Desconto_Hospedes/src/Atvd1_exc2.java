//Importando o Scanner
import java.util.Scanner;

public class Atvd1_exc2 {

    public static void main(String[] args) 
    {
    //Declarando a variável da idade e nome dos hóspedes
    int idade1, idade2;
    String nome1, nome2;
    
    //Declarando o scanner
    Scanner entrada = new Scanner (System.in);
    
    //Trecho para a entrada de dados
    System.out.println("Insira o nome do primeiro hóspede: ");
    nome1 = entrada.next();
    
    System.out.println("\nInsira a idade do primeiro hóspede: ");
    idade1 = entrada.nextInt();
    
    System.out.println("\nInsira o nome do segundo hóspede: ");
    nome2 = entrada.next();
    
    System.out.println("\nInsira a idade do segundo hóspede: ");
    idade2 = entrada.nextInt();
    
    //Fechando o buffer de entrada
    entrada.close();
    
        //Inserindo as condicionais
        if (idade1 > idade2 && idade1 >= 60)
        {
        System.out.println("\nO(a) hóspede " + nome1 + " ficará no quarto A e terá 40% de desconto, enquanto o(a) hóspede " + nome2 + " ficará no quarto B.");
        }
        
        else if (idade2 > idade1 && idade2 >= 60)
        {
        System.out.println("\nO(a) hóspede " + nome2 + " ficará no quarto A e terá 40% de desconto, enquanto o(a) hóspede " + nome1 + " ficará no quarto B.");
        }
        
        else if (idade1 > idade2)
        {
        System.out.println("\nO(a) hóspede " + nome1 + " ficará no quarto A, enquanto o(a) hóspede " + nome2 + " ficará no quarto B.");
        }
        
        else if (idade2 > idade1)
        {
        System.out.println("\nO(a) hóspede " + nome2 + " ficará no quarto A, enquanto o(a) hóspede " + nome1 + " ficará no quarto B.");
        }
        
        else if (idade1 == idade2)
        {
        System.out.println("\nO(a) hóspede " + nome1 + " ficará no quarto A, enquanto o(a) hóspede " + nome2 + " ficará no quarto B.");
        }
        
    }
    
}
