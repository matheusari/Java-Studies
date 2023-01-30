package atvd2;

import java.util.Scanner;

public class Atvd2 
{    
    public static void main(String[] args) 
    {
    int numero, pontos;
    double valorMaisde3 = 0;
    double valorMaisde3_2 = 0;
    
    Ponto2D newP2D = new Ponto2D();
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("\t\t\tSEJA BEM-VINDO A CALCULADORA DE VETORIAIS");
    System.out.println("---------------------------------------------------------------------------------------");
    System.out.println("1.Calcular a distância entre dois pontos.\t2.Multiplicar um ponto por um valor (k)");
    System.out.println("---------------------------------------------------------------------------------------");
    System.out.println("Escolha uma das opções:\t");
    numero = input.nextInt();
    
        switch (numero) 
        {
        case 1:
            System.out.println("\nInforme o valor de X do primeiro ponto:");
            newP2D.Xa = input.nextDouble();
            
            System.out.println("\nInforme o valor de Y do primeiro ponto:");
            newP2D.Ya = input.nextDouble();
            
            System.out.println("\nInforme o valor de X do segundo ponto:");
            newP2D.Xb = input.nextDouble();
            
            System.out.println("\nInforme o valor de Y do segundo ponto:");
            newP2D.Yb = input.nextDouble();
            
            // Cálculo da distância dividido em etapas:
            double p= newP2D.Xb - newP2D.Xa;
            double q= newP2D.Yb - newP2D.Ya;
            double r= p * p;
            double s= q * q;
            double distancia = Math.sqrt(r+s);
            
            
            System.out.println("\nA distância do ponto A (" + newP2D.Xa + " ," + newP2D.Ya + ") e o ponto B ("+ newP2D.Xb + " ," + newP2D.Yb + ") é: " + distancia);
            break;
            
        case 2:
            System.out.println("\nInforme o valor de X do ponto:");
            newP2D.Xa = input.nextDouble();
            
            System.out.println("\nInforme o valor de Y do ponto:");
            newP2D.Ya = input.nextDouble();
            
            System.out.println("\nInforme o multiplicador (k):");
            newP2D.k = input.nextDouble();
            
            //Novo valor de X:
            double newX = newP2D.Xa * newP2D.k;
            //Novo valor de Y:
            double newY = newP2D.Ya * newP2D.k;
            
            System.out.println("O novo ponto resultante entre a multiplicação de k = " + newP2D.k + " e o ponto A (" + newP2D.Xa + " ," + newP2D.Ya + ") é igual a B (" + newX + " ," + newY + ").");
            break;

        default:
            System.out.println("\n---------------");
            System.out.println("OPÇÃO INVÁLIDA.");
            System.out.println("---------------");
            break;
            
        }
    }
    
}
