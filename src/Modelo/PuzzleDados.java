/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.lang.reflect.Array;

/**
 *
 * @author Andres Muñoz Bravo
 */
public class PuzzleDados {
    public Dado[] puzzle=new Dado[15];
    
    public PuzzleDados(){
        for (int i=0; i<15 ; i++){
            this.puzzle[i]= new Dado();
        }
    }
    
}
