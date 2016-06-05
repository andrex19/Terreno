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
import javax.swing.ImageIcon;


/**
 *
 * @author Samsung
 */
public class ControladorTerreno2 extends MouseAdapter implements ActionListener{
    MatrizTerreno cp;
    VistaTerreno2 vistaTerreno;
    ImageIcon goku,rojo,verde,azul;
    Dado dado;
    public Casilla[][] infoCasillas; 
    public int[][] carasDado;
    public static int numero=0;
    public static int rotacion=0;
    //JefeTerreno JefeTerreno;
    //ControladorMenu contMenu=new ControladorMenu();

    public ControladorTerreno2() {
        this.dado = new Dado();
        this.goku = new ImageIcon(this.getClass().getResource("/Imagenes/goku.png"));
        this.rojo = new ImageIcon(this.getClass().getResource("/Imagenes/rojo.png"));
        this.verde = new ImageIcon(this.getClass().getResource("/Imagenes/verde.png"));
        this.azul = new ImageIcon(this.getClass().getResource("/Imagenes/azul.png"));
        this.infoCasillas = new Casilla[15][15];
        for (int i=0;i<15;i++){
            for (int j=0;j<15;j++){
                infoCasillas[i][j]=new Casilla();
                
            }
        }
        
    }
    
    
       
    public void verVista(MatrizTerreno cp) {
    
    this.cp=cp;
    this.vistaTerreno=new VistaTerreno2();
    this.vistaTerreno.setVisible(true);
    this.vistaTerreno.agregarListener(this,this);
    

    }
    

    public void ponerFigura(int[][] carasDado,String jefe1){
                      
        for (int[]fila:carasDado){
            vistaTerreno.botones[fila[0]][fila[1]].setIcon(goku);
            this.infoCasillas[fila[0]][fila[1]].terreno=jefe1;
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
    public void limpiar(){
        for (int i=0;i<15;i++){
            for (int j=0;j<15;j++){
                if (infoCasillas[i][j].terreno.equals("")){
                    vistaTerreno.botones[i][j].setIcon(null);
                }
                
            }
        }
    }
    public boolean metodo3(int x, int y){
        boolean aux=false;
        for (int[]cara:carasDado){
            
                if ((cara[0]+1>=0 && cara[0]+1<15 && cara[1]>=0 && cara[1]<15)){
                    if (infoCasillas[cara[0]+1][cara[1]].terreno.equals("mio!")){
                        return true ;
                    }
                }
                if ((cara[0]>=0 && cara[0]<15 && cara[1]+1>=0 && cara[1]+1<15)){
                    if (infoCasillas[cara[0]][cara[1]+1].terreno.equals("mio!")){
                        return true ;
                    }
                }
                if ((cara[0]-1>=0 && cara[0]-1<15 && cara[1]>=0 && cara[1]<15)){
                    if (infoCasillas[cara[0]-1][cara[1]].terreno.equals("mio!")){
                        return true ;
                    }
                }
                if ((cara[0]>=0 && cara[0]<15 && cara[1]-1>=0 && cara[1]-1<15)){
                    if (infoCasillas[cara[0]][cara[1]-1].terreno.equals("mio!")){
                        return true ;
                    }
                }
                
            }
        return aux;    
    }
    
    
    public void metodo1(int[][] carasDado, boolean boleano){
        boolean aux=true;
        if(boleano==true){

           for (int[]cara:carasDado){
                aux=metodo3(cara[0],cara[1]);
                
                
                
                /*if (aux==true){
                    System.out.println("("+cara[0]+"."+cara[1]+")"+" puede poner");
                }
                else{
                    System.out.println("("+cara[0]+"."+cara[1]+")"+" no puede puede poner");
                }*/
                
                  
                
           }   
           for (int[]cara:carasDado){
                if (cara[0]<0 || cara[0]>14 || cara[1]<0 || cara[1]>14){
                    aux=false;
                    }
           }  
           for (int[]cara:carasDado){
                if ((cara[0]>=0 && cara[0]<15 && cara[1]>=0 && cara[1]<15)){
                    if (infoCasillas[cara[0]][cara[1]].terreno.equals("")==false){
                        aux=false;
                    }
                }
           }    
            
            
            if (aux){
                for (int[]cara:carasDado){
                    if ((cara[0]>=0 && cara[0]<15 && cara[1]>=0 && cara[1]<15)){           
                        if (infoCasillas[cara[0]][cara[1]].terreno.equals("")){
                            vistaTerreno.botones[cara[0]][cara[1]].setIcon(verde);     
                        }
                    }
                }
                
            }
            else{
                for (int[]cara:carasDado){
                    if ((cara[0]>=0 && cara[0]<15 && cara[1]>=0 && cara[1]<15)){           
                        if (infoCasillas[cara[0]][cara[1]].terreno.equals("")){
                            vistaTerreno.botones[cara[0]][cara[1]].setIcon(rojo);     
                        }
                    }
                }
                
            }
            
            
        }
        else{
            limpiar();
        }
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i=0;i<15;i++){
            for (int j=0;j<15;j++){
               if (vistaTerreno.botones[i][j]==e.getSource()){
                    System.out.println(" haz presionado el boton !("+i+","+j+")" );
                    carasDado=dado.generarTerreno(i,j,numero,rotacion);
                    if (verificarTerreno(carasDado)){
                        ponerFigura(carasDado,"mio!");
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
            System.out.println(" Cambiar figura anterior");
            if (numero>0){
                numero-=1;
            }
            limpiar();
            
        }
        else if(e.getWheelRotation()==-1){
            System.out.println(" cambiar figura siguiente");
            if (numero<10){
                numero+=1;
            } 
            limpiar();
        }
    }
    @Override
    public void mousePressed(MouseEvent e){
        System.out.println("rotar las figuras 90 grados");
        if (e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK){
            rotacion+=1;
            if (rotacion==4){
                rotacion=0;
            }
            limpiar();
                    
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        for (int i=0;i<15;i++){
            for (int j=0;j<15;j++){
               if (vistaTerreno.botones[i][j]==e.getSource()){
                    System.out.println(" mouse sobre el boton!("+i+","+j+")" );
                    //vistaTerreno.botones[i][j].setIcon(pasto);
                    carasDado=dado.generarTerreno(i,j,numero,rotacion);
                    metodo1(carasDado,true);
                                       
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
                    carasDado=dado.generarTerreno(i,j,numero,rotacion);
                    metodo1(carasDado,false);
                }
            }
        }
    }
  
    
}
