/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg4;

import java.util.Scanner;


public class Ejercicio4 {

    private static int i;

    /**
     * @param args the command line arguments
     * @param <error>
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
      Scanner lector = new Scanner(System.in);
      
      String []arreglo=new String[20];
      String ciudades;
      
     for(int i=0;i<arreglo.length;i++){
     System.out.println("ciudad ");
     ciudades=lector.nextLine();
     arreglo[i]=ciudades;
     
  }
      for(int i=0;i<arreglo.length;i++){
       System.out.println("la ciudad es " + arreglo[i]);
       
    }
      
    }
}
                                                               

   
    

