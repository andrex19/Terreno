/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.Casilla;
import Modelo.Dado;
import Vista.VistaTerreno2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.Scanner;
import javax.swing.ImageIcon;

/**
 *
 * @author Samsung
 */
public class ControladorTerreno2 extends MouseAdapter implements ActionListener{
    MatrizTerreno cp;
    VistaTerreno2 vistaTerreno;
    ImageIcon goku =new ImageIcon(this.getClass().getResource("/Imagenes/goku.png"));
    Dado dado=new Dado();
    public Casilla[][] mapa = new Casilla[15][15]; 
    public int[][] carasDado;
    public static int numero=0;
    //JefeTerreno JefeTerreno;
    //ControladorMenu contMenu=new ControladorMenu();
    
    
       
    public void verVista(MatrizTerreno cp) {
    
    this.cp=cp;
    this.vistaTerreno=new VistaTerreno2();
    this.vistaTerreno.setVisible(true);
    this.vistaTerreno.agregarListener(this,this);
    

    }
    

    public void ponerFigura(int[][] carasDado){
                      
        for (int[]fila:carasDado){
            vistaTerreno.botones[fila[0]][fila[1]].setIcon(goku);
            
        }
     }
    public boolean verificarTerreno(int[][]carasDado){
        boolean respuesta=true;
        for (int[]fila:carasDado){
            if(fila[0]<0 || fila[0]>14 || fila[1]<0 || fila[1]>14){
                return false;
            }
        }
        return respuesta;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i=0;i<15;i++){
            for (int j=0;j<15;j++){
               if (vistaTerreno.botones[i][j]==e.getSource()){
                    System.out.println(" haz presionado el boton !("+i+","+j+")" );
                    //vistaTerreno.botones[i][j].setIcon(pasto);
                    carasDado=dado.generarTerreno(i, j, numero);
                    if (verificarTerreno(carasDado)){
                        ponerFigura(carasDado);
                    }
                    else{
                        System.out.println("No se peude desplegar el dado");
                    }
                    
               }
            }
        }
    }


    @Override
    public void mouseWheelMoved(MouseWheelEvent e){
        if (e.getWheelRotation()==1){
            System.out.println(" hacia abajo");
            if (numero>0){
                numero-=1;
            }            
        }
        else if(e.getWheelRotation()==-1){
            System.out.println(" hacia arriba");
            if (numero<10){
                numero+=1;
            }     
        }
    }
/*
    @Override
    public void mouseEntered(MouseEvent e) {
        for (int i=0;i<15;i++){
            for (int j=0;j<15;j++){
               if (vistaTerreno.botones[i][j]==e.getSource()){
                    System.out.println(" mouse sobre el boton!("+i+","+j+")" );
                    //vistaTerreno.botones[i][j].setIcon(pasto);
                    
                    if (dado.verificarTerreno(carasDado)){
                        ponerFigura(carasDado);
                    }
                    else{
                        System.out.println("No se peude desplegar el dado");
                    }
                    
               }
            }
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        for (int i=0;i<15;i++){
            for (int j=0;j<15;j++){
               if (vistaTerreno.botones[i][j]==e.getSource()){
                    System.out.println(" mouse sobre el boton!("+i+","+j+")" );
                    //vistaTerreno.botones[i][j].setIcon(pasto);
                    
                    if (dado.verificarTerreno(carasDado)){
                        ponerFigura(carasDado);
                    }
                    else{
                        System.out.println("No se peude desplegar el dado");
                    }
                    
               }
            }
        }
    }
*/   
    
}
