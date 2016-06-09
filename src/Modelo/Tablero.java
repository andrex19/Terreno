/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Andres Muñoz Bravo
 */
public class Tablero {
    public Casilla[][] infoCasillas=new Casilla[15][15];
    public Tablero(){
        System.out.println("hola tablero ");
        for (int i=0;i<15;i++){
            for (int j=0;j<15;j++){
                this.infoCasillas[i][j]=new Casilla();
                System.out.println("casilla creada ("+i+","+j+")");
            }
       
        
        }
        
    }
    
}
