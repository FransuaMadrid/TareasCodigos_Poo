/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursos;


public class Triangulo extends Formas {
    public String Angulo;
    
    public void EstablecerAngulo(String angulo){
        this.Angulo = angulo;
    }
    
    public String EstablecerAngulo(){
        return this.Angulo;
        
    }
    public Triangulo(){
        EstablecerDibujo("Triangulo");
        CalcularArea("16");
        Angulo = ("8");
    }
    
    public void ImprimirInformacionAngulo(){
        System.out.println("Angulo: "+ Angulo);
    }
}
