/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo4parte1encapsulamiento;

import Clases.Ciudadano;


public class Modulo4Parte1Encapsulamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        //Instanciamos la clase ciudadano y creamos el objeto
       Ciudadano ciudadano = new Ciudadano("Fransua Madrid");
        
       ciudadano.imprimirElNombre();
        
        //Establecemos un valor a Variable edad
        ciudadano.ImprimirEdad(21);
        
        //Imprimimos el valor de edad
        System.out.println(ciudadano.ValorEdad());
        
        //Establecemos un valor a variable Experiencia
        ciudadano.ImprimirañosExperiencia(3);
        
        //imprimimos el valor a la variable Experiencia
        System.out.println(ciudadano.ValorañosExperiencia());
    }
    }
    
