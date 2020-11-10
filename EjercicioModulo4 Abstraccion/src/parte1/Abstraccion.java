/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte1;


import Recursos.Belize;
import Recursos.Guatemala;
import Recursos.Honduras;

//Elaborado Por Fernando

public class Abstraccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Guatemala GA = new Guatemala();
        Honduras HN = new Honduras();
        Belize BZ = new Belize();
        
        System.out.println(GA.getpais());
        System.out.println(GA.getpresidente());
        System.out.println(HN.getpais());
        System.out.println(HN.getpresidente());
        System.out.println(BZ.getpais());
        System.out.println(BZ.getpresidente());
    }
    
}
