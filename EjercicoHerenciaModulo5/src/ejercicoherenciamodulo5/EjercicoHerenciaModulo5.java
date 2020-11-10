/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicoherenciamodulo5;

import Recursos.Circulo;
import Recursos.Cuadrado;
import Recursos.Linea;
import Recursos.Triangulo;


public class EjercicoHerenciaModulo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Linea linea = new Linea();
        Triangulo triangulo = new Triangulo();
        Cuadrado cuadrado = new Cuadrado();
        
        System.out.println("F O R M A S");
        System.out.println();
        circulo.ImprimirInformacionCirculo();
        System.out.println();
        linea.ImprimirInformacionLinea();
        linea.ImprimirInformacionLargo();
        System.out.println();
        triangulo.ImprimirInformacionTriangulo();
        triangulo.ImprimirInformacionAngulo();
        System.out.println();
        cuadrado.ImprimirInformacionCuadrado();
                
    }
    
}
