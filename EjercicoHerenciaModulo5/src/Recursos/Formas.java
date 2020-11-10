/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursos;


public class Formas {
    
    //Metodos
    private String Dibujar;
   
    private String CalcularRadio;
    
    private String CalcularArea;
    
    
//Constructor
    public Formas() {
}
    
   public void EstablecerDibujo(String Nombre){
       this.Dibujar = Nombre;
   }
   public String ObtenerDibujo (){
   return this.Dibujar;
   }
   
   public void CalcularRadio(String Radio){
       this.CalcularRadio = Radio;  
   }
   public String CalcularRadio (){
   return this.CalcularRadio;
   }
   
   public void CalcularArea(String Area){
       this.CalcularArea = Area;
   }
   
   public String CalcularArea(){
       return this.CalcularArea;
   }
   
   //Imprimir la informacion
   public void ImprimirInformacionCirculo(){
       System.out.println("Dibujar: "+ Dibujar);
       System.out.println("Radio: "+ CalcularRadio);
   }
   
   public void ImprimirInformacionLinea(){
       System.out.println("Dibujar: "+ Dibujar);
   }
    public void ImprimirInformacionTriangulo(){
        System.out.println("Dibujar: "+ Dibujar);
        System.out.println("Area: "+ CalcularArea);
    }
    
    public void ImprimirInformacionCuadrado(){
        System.out.println("Dibujar: "+ Dibujar);
        System.out.println("Area: "+ CalcularArea);
    }
}
