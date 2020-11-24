/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidordemoneda;


public class ConvertidorDeMonedas {
    private double Valor;
    private int monedaInicial;
    private int monedaFinal;
    private double resultado;

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public int getMonedaInicial() {
        return monedaInicial;
    }

    public void setMonedaInicial(int monedaInicial) {
        this.monedaInicial = monedaInicial;
    }

    public int getMonedaFinal() {
        return monedaFinal;
    }

    public void setMonedaFinal(int monedaFinal) {
        this.monedaFinal = monedaFinal;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }





    public ConvertidorDeMonedas() {
    }
    
    public double Convertir(){
        
        if(monedaInicial==0 && monedaFinal==1){
            resultado= Valor * 0.84;
        }else if(monedaInicial==0 && monedaFinal==0){
            resultado=Valor;
        }
        
        if(monedaInicial==1 && monedaFinal==0){
            resultado= Valor * 1.19;
        }else if(monedaInicial==1 && monedaFinal==1){
            resultado=Valor;
        }
        
        if(monedaInicial==0 && monedaFinal==2){
            resultado= Valor * 24.32;
        }else if(monedaInicial==0 && monedaFinal==0){
            resultado=Valor;
        }
        
        if(monedaInicial==2 && monedaFinal==0){
            resultado= Valor * 0.041;
        }else if(monedaInicial==2 && monedaFinal==2){
            resultado=Valor;
        }
        
        if(monedaInicial==1 && monedaFinal==2){
            resultado= Valor * 28.84;
        }else if(monedaInicial==1 && monedaFinal==1){
            resultado=Valor;
        }
        
        if(monedaInicial==2 && monedaFinal==1){
            resultado= Valor * 0.035;
        }else if(monedaInicial==2 && monedaFinal==2){
            resultado=Valor;
        }
        return resultado;
    }
}
