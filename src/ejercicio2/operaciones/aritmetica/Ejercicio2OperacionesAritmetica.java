/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.operaciones.aritmetica;

import java.util.Scanner;



public class Ejercicio2OperacionesAritmetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
     int numero1,numero2;
     int suma,resta,multiplicacion,division;
     
     Scanner sc =new Scanner(System.in);
     
     System.out.println("primer valor");
     numero1 = sc.nextInt();
     System.out.println("segundo valor");
     numero2 = sc.nextInt();
     
     suma = numero1+numero2;
     System.out.println("la suma es : "+suma);
     
     resta = numero1-numero2;
     System.out.println("la resta es : "+resta);
     
     multiplicacion = numero1*numero2;
     System.out.println("la multiplicacion es : "+multiplicacion);
     
     division = numero1/numero2;
     System.out.println("la division es : "+division);
  
    }
    
}
