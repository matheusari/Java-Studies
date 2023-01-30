package atvd3;

import java.util.Scanner;

public class Atvd3 
{
    public static void main(String[] args) 
    {
    long i=0;
    String continuar;
    double aumento;
    String firstname;
    String surname;
    long CPF;
    long fone;
    String setor;
    String contrato;
    double sal;
    double sal2=0;
    double horas;
    double valor;
    
    Scanner input = new Scanner (System.in);
    
    System.out.println("Seja bem-vindo ao nosso sistema.");
    System.out.println("Primeiramente, informe a taxa, em porcentagem, do aumento geral no salário dos funcionários (ex: 10):");
    aumento = input.nextDouble();
    
        do
        {
        i++;
        
        System.out.println("\nInsira o primeiro nome do funcionário: ");
        firstname = input.next();
        
        System.out.println("\nInsira o sobrenome do funcionário: ");
        surname = input.next();
        
        System.out.println("\nInsira o CPF do funcionário (apenas números): ");
        CPF = input.nextLong();
    
        System.out.println("\nInsira o telefone do funcionário (apenas números): ");
        fone = input.nextLong();
        
        System.out.println("\nInforme o setor em que o funcionário trabalha: ");
        setor = input.next();

        System.out.println("\nO funcionário é assalariado ou horista? ");
        contrato = input.next();
        
            if (contrato.equals("assalariado") || contrato.equals("Assalariado"))
            {
            System.out.println("\nInsira o salário do funcionário: ");
            sal = input.nextDouble();
            
            sal2 = ((aumento/100)+1)*sal;
            }
            
            if (contrato.equals("horista") || contrato.equals("Horista"))
            {
            System.out.println("\nInsira a quantidade de horas trabalhadas pelo funcionário no mês: ");
            horas = input.nextDouble();
            
            System.out.println("\nInsira o valor das horas do funcionário: ");
            valor = input.nextDouble();
            
            sal=(horas*valor);
            sal2 = ((aumento/100)+1)*sal;
            }
        
        System.out.println("\nNome: " + firstname + " " + surname + "\tCPF: " + CPF);
        System.out.println("Telefone: " + fone + "\tSetor: " + setor);
        System.out.println("Contrato: " + contrato);
        System.out.println("O novo salário do funcionário é de R$" + sal2);
        
        System.out.println("\nDeseja continuar informando funcionários? S/N");
        System.out.println("* Lembre-se: o número máximo de funcionários aceitos é 10.");
        continuar = input.next();
        
             if (continuar.equals("N") || continuar.equals("n"))
             {
             break;
             }
             
        } while (i<10);   
    }  
}
