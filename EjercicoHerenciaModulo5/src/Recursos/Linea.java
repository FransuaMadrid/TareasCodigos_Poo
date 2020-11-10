/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursos;

/**
 *
 * @author Jose Alejandro
 */
public class Linea extends Formas{
    public String Largo;
    
    public void EstablecerLargo(String largo){
        this.Largo = largo;
    }
    
    public String EstablecerLargo(){
        return this.Largo;
    }
    public Linea(){
        EstablecerDibujo("Linea");
        Largo =("10");
    }
    
    public void ImprimirInformacionLargo(){
        System.out.println("Largo: "+ Largo);
    }
}
