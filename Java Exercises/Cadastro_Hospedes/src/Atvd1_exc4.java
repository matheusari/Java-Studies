import java.io.*;
import java.util.Hashtable;

public class Atvd1_exc4
{
public static void main(String []args)
{
    try
    {
		
    Hashtable name = new Hashtable();
    boolean l = true;
    int timer = 0;
    int opcao = 0;
    String palavra;
    
    	System.out.println("\t\tSEJA BEM-VINDO AO HOTEL VÁRZEA PAULISTA!");
        System.out.println("--------------------------------------------------------------------------------");
	do
	{
	System.out.println("\n1 - Cadastrar\t|\t2 - Listar\t|\t3 - Consultar\t|\t4 - Sair");
        System.out.println("\nEscolha uma das opções acima:\t");
        
            try
            {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            palavra = br.readLine();
            opcao = Integer.parseInt(palavra);
            }
            catch(Exception e)
            {
            System.out.println("Opção Inválida!");
			}
			System.out.println("\n");
			switch (opcao)
			{
                          
			case 1:
				try
				{
				System.out.println("Insira o nome do hóspede a ser cadastrado:\t");
				BufferedReader captura = new BufferedReader(new InputStreamReader(System.in));
                                palavra = captura.readLine();
				name.put(new Integer(timer++), palavra);
				}
                                
				catch(Exception e)
				{
				System.out.println("Opção Inválida!");
				}
                                
				break;
                                
			case 2:
				try
				{
                                    for (int i = 0; i <= name.size()-1; i++)
                                    {
                                    System.out.println("Posicao: "+i+" " + (String)name.get(new Integer(i))+"\n");
                                    }
				}
                                catch(Exception e)
				{
                                System.out.println("Dado não cadastrado!");
				}
                                
				break;
                                
                        case 3:
                                System.out.println("Informe a posição que deseja consultar:\t"); 
                                BufferedReader captura = new BufferedReader(new InputStreamReader(System.in)); 
                                String posicao = captura.readLine(); 
                                System.out.println("Posicao: " + posicao + name.get(new Integer(posicao)));
				
                                break; 

			case 4:
				l = false;
				break;
                                default: System.out.println("Opção Inválida!");
			}
	} while(l);
    }
    catch(Exception e)
    {
    e.printStackTrace();
    }
}
}


