/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class Ciudadano {
    
    //Creamos la variable Nombre
    private String nombre;
    
    //Creamos la variale Edad
    private int Edad;
    
    //Creamos la variable AñosdeExperiencia
    private int AñosdeExperiencia;
    
    //Establecemos E imprimimos la variable Nombre
    public Ciudadano(String nombre){
        this.nombre =nombre;
    }
    
    public void imprimirElNombre(){
        System.out.println(nombre);
    }
    
    //Imprimimos la Variable Edad y le damos un valor
    public void ImprimirEdad(int laedad){
        this.Edad =laedad;    
    }
    
    public int ValorEdad(){
        
        return Edad;
    }
    
    //Imprimimos la variable Experiencia y le damos un valor
    public void ImprimirañosExperiencia(int AñosExperiencia){
        this.AñosdeExperiencia = AñosExperiencia;
    }
    
    public int ValorañosExperiencia(){
       
        return AñosdeExperiencia;
    }
}
