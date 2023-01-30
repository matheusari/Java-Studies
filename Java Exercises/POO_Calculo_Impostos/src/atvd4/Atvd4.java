package atvd4;

import java.util.Scanner;

public class Atvd4 
{

    public static void main(String[] args) 
    {
    int numero;
    
    mercadoriaAliquota newmercadoriaAliquota = new mercadoriaAliquota();
    debitoCredito newdebitoCredito = new debitoCredito();
    IPI newIPI = new IPI();
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Seja bem-vindo!\nEssas são as disponibilidades de cálculo para impostos na plataforma:\n");
    System.out.println("1.PIS\t\t\t2.Cofins\n3.ICMS\t\t\t4.IPI");
    System.out.println("\nEscolha uma das opções:\t");
    numero = input.nextInt();
    
        switch (numero) 
        {
          case 1:
            System.out.println("\n------------------------------------------------------------------------------------------------------");
            System.out.println("\nVocê escolheu o Programa de Integração Social (PIS).");
            System.out.println("Tal modelo de tributação necessita do valor total de débito e do valor total de crédito da empresa.\n");

            System.out.println("Insira o total de débitos da sua empresa:");
            newdebitoCredito.debitos = input.nextDouble();

            System.out.println("\nAgora, insira o total de créditos da sua empresa:");
            newdebitoCredito.creditos = input.nextDouble();

            double pis = (newdebitoCredito.debitos - newdebitoCredito.creditos) * 0.0165;

            System.out.println("\nA empresa pagará R$" + pis + " em PIS.");
            break;
            
          case 2:
            System.out.println("\n------------------------------------------------------------------------------------------------------");
            System.out.println("\nVocê escolheu a Contribuição para o Financiamento da Seguridade Social (Cofins).");
            System.out.println("Tal modelo de tributação necessita do valor total de débito e do valor total de crédito da empresa.\n");

            System.out.println("Insira o total de débitos da sua empresa:");
            newdebitoCredito.debitos = input.nextDouble();

            System.out.println("\nAgora, insira o total de créditos da sua empresa:");
            newdebitoCredito.creditos = input.nextDouble();

            double cofins = (newdebitoCredito.debitos - newdebitoCredito.creditos) * 0.076;

            System.out.println("\nA empresa pagará R$" + cofins + " em Cofins.");
            break;
            
          case 3:
            System.out.println("\n------------------------------------------------------------------------------------------------------");
            System.out.println("\nVocê escolheu o Imposto sobre Circulação de Mercadorias e Serviços (ICMS).");
            System.out.println("Tal modelo de tributação necessita do valor da mercadoria tributada e da alíquota (que varia).\n");

            System.out.println("Insira o valor da mercadoria tributada:");
            newmercadoriaAliquota.mercadoria = input.nextDouble();

            System.out.println("\nAgora, insira o valor da alíquota:");
            newmercadoriaAliquota.aliquota = input.nextDouble();

            double icms = newmercadoriaAliquota.mercadoria * (newmercadoriaAliquota.aliquota/100);

            System.out.println("\nA empresa pagará R$" + icms + " em ICMS.");
            break;
            
          case 4:
            System.out.println("\n------------------------------------------------------------------------------------------------------");
            System.out.println("\nVocê escolheu o Imposto sobre Produtos Industrializados (IPI).");
            System.out.println("Tal modelo de tributação necessita do valor da alíquota e valor do produto, frete, seguro, outras despesas.\n");

            System.out.println("Insira o valor da mercadoria:");
            newIPI.mercadoria = input.nextDouble();
            
            System.out.println("\nInsira o valor do frete:");
            newIPI.frete = input.nextDouble();

            System.out.println("\nInsira o valor do seguro:");
            newIPI.seguro = input.nextDouble();
            
            System.out.println("\nInsira o valor das outras despesas:");
            newIPI.despesas = input.nextDouble();
            
            
            System.out.println("\nAgora, insira o valor da alíquota:");
            newIPI.aliquota = input.nextDouble();

            double ipi = (newIPI.mercadoria + newIPI.frete + newIPI.seguro + newIPI.despesas) * (newIPI.aliquota/100);

            System.out.println("\nA empresa pagará R$" + ipi + " em IPI.");
            break;
            
        default:
        System.out.println("\n---------------");
        System.out.println("OPÇÃO INVÁLIDA.");
        System.out.println("---------------");
       
        }       
    }
}

