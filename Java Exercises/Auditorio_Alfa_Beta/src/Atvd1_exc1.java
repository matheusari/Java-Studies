//Importando o Scanner
import java.util.Scanner;

public class Atvd1_exc1 {

    public static void main(String[] args) 
    {
    //Declarando a variável de convidados
    int numConvidados;
    
    //Declarando o scanner
    Scanner entrada = new Scanner (System.in);
    
    //Trecho para a inserção de dados
    System.out.println("Insira a quantidade de convidados: ");
    numConvidados = entrada.nextInt();
    
    //Fechando o buffer de entrada
    entrada.close();
    
    //Iniciando as variáveis
        if (numConvidados >220 && numConvidados <=350 )
        {
        System.out.println("\nUse o Auditório Beta.\n");
        }
        
        else if (numConvidados >= 0 && numConvidados <=150 )
        {
        System.out.println("\nUse o Auditório Alfa.\n");
        }
        
        //Esquema utilizado para contar as cadeiras adicionais
        else if (numConvidados > 150 && numConvidados <=220 )
        {
        int cadeirasAdicionais = numConvidados - 150;
        System.out.println("\nUse o Auditório Alfa com " + cadeirasAdicionais + " cadeiras Adicionais.\n");
        }
        
        else 
        {
	System.out.println("\nNúmero de convidados inválido.\n");
        }
    }
}
