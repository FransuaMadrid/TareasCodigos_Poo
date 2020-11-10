/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo4parte2abstraccion;

import Clases.ElSalvador;
import Clases.Honduras;
import Clases.Mexico;



public class Modulo4parte2Abstraccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ElSalvador SA = new ElSalvador();
        Honduras HN = new Honduras();
        Mexico MX = new Mexico();
        
        System.out.println(SA.getpais());
        System.out.println(SA.getpresidente());
        System.out.println(HN.getpais());
        System.out.println(HN.getpresidente());
        System.out.println(MX.getpais());
        System.out.println(MX.getpresidente());
    }
    
}
