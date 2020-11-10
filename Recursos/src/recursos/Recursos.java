/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;


public class Recursos {
    public static void main(String arg[ ]) {

   
Mensajes mensajes = new Mensajes(); 
mensajes.Saludo();                  
mensajes.MayorMenor(10);
mensajes.multiplicaciones(5,4);
    }
   
    public static class Mensajes {

  //primer metodo
  public static String Saludo() {
    System.out.println("Estoy aprendiendo, pero sere el mejor programador");
      return null;
}
    
  //segundo metodo
public static int MayorMenor(int edad) {
  if (edad > 18){
     System.out.println("Eres mayor de edad");
  }else{
     System.out.println("Eres menor de edad");
     }
      return 0;
    }

//tercer metodo
public int multiplicaciones(int a, int b) {
    int multiplicacion = a*b;
    System.out.println("la multiplicacion es: "+ multiplicacion);
    return multiplicacion;
    
}

 
        
    }
  }

