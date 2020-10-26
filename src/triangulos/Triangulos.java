package triangulos;

import java.util.Scanner;

public class Triangulos 
{
    public static void main(String[] args) 
    {
    Scanner leia = new Scanner(System.in);
    double a, b, c;
    
    System.out.println("Digite o valor do 1° segmento(A):");
    a = leia.nextDouble();
    System.out.println("Digite o valor do 2² segmento(B):");
    b = leia.nextDouble();
    System.out.println("Digite o valor do 3° segmento(C):");
    c = leia.nextDouble();
    
    if(a+b>c && a+c>b && c+b>a)
    {
     if(a==b && a==c && b==c)
     {
     System.out.println("Há a formação de um triângulo Equilátero.");    
      } 
      else if(a!=b && a!=c && b!=c)
      {
      System.out.println("Há a formação de um triângulo Escaleno.");
       }
      else if(((a==b) && (a!=c)) || ((a==c) && (a!=b)) || ((b==c) && (b!=a)))
       {
       System.out.println("Há a formação de um triângulo Isósceles");
        }
    }
    else
    { 
    System.out.println("Não há a formação de um triângulo");    
    }
  }
}
