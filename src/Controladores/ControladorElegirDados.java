/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.Jugador;
import Modelo.PuzzleDados;
import Vista.VistaBatalla;
import Vista.VistaElegirDados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;


/**
 *
 * @author Andres Muñoz Bravo
 */
public class ControladorElegirDados extends MouseAdapter implements ActionListener {
    public VistaElegirDados vistaED;
    public PuzzleDados puzle;
    
    public void verVista(PuzzleDados puzle){
            
        this.puzle=puzle;
        this.vistaED=new VistaElegirDados();
        this.vistaED.setVisible(true);
        this.vistaED.agregarListener(this,this); 
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (vistaED.getBtn1()==e.getSource()){
            System.out.println("pene 1");
        } 
        if (vistaED.getBtn2()==e.getSource()){
            System.out.println("pene 2");
        } 
    }
    
}
