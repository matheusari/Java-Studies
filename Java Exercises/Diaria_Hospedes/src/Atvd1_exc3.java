//Importando o Scanner
import java.util.Scanner;

public class Atvd1_exc3
{

    public static void main(String[] args) 
    {
    int idade, diaria=0, inteira=0, total=0, gratuidade=0, meia=0, contador=0;
    String hospede = null;
    
    //Declarando o scanner
    Scanner entrada = new Scanner (System.in);
    
    System.out.println("Bem vindo ao Hotel Várzea Paulista!\nO valor padrão de nossa diária é R$100,00.\n* Escreva 'PARE' ao adicionar mais hóspedes caso queira finalizar a operação.\n");
    
        while (contador==0)
        {
        System.out.println("Insira o nome do hóspede: ");
        hospede = entrada.next();
        
            if (hospede.equals("PARE"))
            {
            System.out.println("\nA soma total das diarias é igual a: R$" + total + "\nForam " + diaria + " diárias, sendo "+ inteira + " inteiras, " + gratuidade + " gratuidades e " + meia + " meias\n");
            contador=1;
            }
            
            else
            {
            System.out.println("Insira a idade do hóspede: ");
            idade = entrada.nextInt();
            
                if (idade > 4 && idade < 80)
                {
                System.out.println("\n" + hospede + " paga inteira.\n");
                total = (total+100);
                diaria++;
                inteira++;
                }
                    
                if (idade < 5)
                {
                System.out.println("\n" + hospede + " possui gratuidade!\n");
                diaria++;
                gratuidade++;
                }
                    
                if (idade >= 80)
                {
                System.out.println("\n" + hospede + " paga meia entrada!\n");
                total = (total+50);
                diaria++;
                meia++;
                }
            }
        }
    } 
}