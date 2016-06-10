/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.Dado;
import Modelo.Jugador;
import Modelo.Tablero;
import Vista.VistaBatalla;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;



/**
 *
 * @author Samsung
 */
public class ControladorBatalla extends MouseAdapter implements ActionListener{
    MatrizTerreno cp;
    VistaBatalla vistaTerreno;
    ImageIcon goku,rojo,verde,azul,kaio;
    Dado dado;
    public int[][] carasDado;
    public static int numero=0;
    public static int rotacion=0;
    public ArrayList <Integer> ordenTurnos;
    private int ultimo_boton;
    public Tablero tablero;
    public int turno;
    public Jugador jugadorActual;
    //public String Andres;
    ArrayList<Jugador> arregloJugadores = new ArrayList<Jugador>();
    

    public ControladorBatalla() {
        this.tablero = new Tablero();
        this.ordenTurnos = new ArrayList<Integer>();
        this.dado = new Dado();
        this.goku = new ImageIcon(this.getClass().getResource("/Imagenes/goku.png"));
        this.kaio = new ImageIcon(this.getClass().getResource("/Imagenes/Kaio-Sama.PNG"));
        this.rojo = new ImageIcon(this.getClass().getResource("/Imagenes/rojo.png"));
        this.verde = new ImageIcon(this.getClass().getResource("/Imagenes/verde.png"));
        this.azul = new ImageIcon(this.getClass().getResource("/Imagenes/azul.png"));

        
    }
    public void generarTurnos(){
        Random random= new Random();
        int aleatorio;
        ArrayList <Integer> aux = new ArrayList<Integer>();
        while (aux.size()<this.arregloJugadores.size()){
            aleatorio=random.nextInt(4);
            if (aux.contains(aleatorio)==false){
                aux.add(aleatorio);
            }
        }
        System.out.println(aux);
        this.ordenTurnos=(ArrayList<Integer>) aux.clone();
        System.out.println(this.ordenTurnos);  
    }
     
    public void verVista(MatrizTerreno cp) {
    
        this.cp=cp;
        this.arregloJugadores= (ArrayList<Jugador>) cp.arreglo_jugadores.clone();
        this.vistaTerreno=new VistaBatalla();
        this.vistaTerreno.setVisible(true);
        this.vistaTerreno.agregarListener(this,this); 
        ponerJefesTerreno(this.arregloJugadores.get(0).usuario,
                this.arregloJugadores.get(1).usuario,
                this.arregloJugadores.get(2).usuario,
                this.arregloJugadores.get(3).usuario);
        generarTurnos();
            System.out.println(this.ordenTurnos);
            System.out.println(ordenTurnos.get(turno));
            jugadorActual=arregloJugadores.get(ordenTurnos.get(turno));
            
            System.out.println("turno: "+turno);
            System.out.println(jugadorActual.usuario);
        
    }
    public void ponerJefesTerreno(String juagdor1, String jugador2, String jugador3, String jugador4){
        tablero.infoCasillas[0][7].terreno=juagdor1;
        tablero.infoCasillas[7][0].terreno=jugador2;/*  Aquí a cada terreno hay que darle el nombre de los distintos jefes de terreno*/
        tablero.infoCasillas[7][14].terreno=jugador3;
        tablero.infoCasillas[14][7].terreno=jugador4;
        vistaTerreno.botones[0][7].setIcon(goku);
        vistaTerreno.botones[7][0].setIcon(kaio);
        vistaTerreno.botones[14][7].setIcon(goku);
        vistaTerreno.botones[7][14].setIcon(kaio);
        System.out.println(tablero.infoCasillas[0][7].terreno+ " terreno puesto en poner terreno");
        System.out.println(tablero.infoCasillas[7][0].terreno+ " terreno puesto en poner terreno");
        System.out.println(tablero.infoCasillas[14][7].terreno+ " terreno puesto en poner terreno");
        System.out.println(tablero.infoCasillas[7][14].terreno+ " terreno puesto en poner terreno");
        
        
        
        

    }
    

    public void ponerFigura(int[][] carasDado,String jefe1){
                      
        for (int[]fila:carasDado){
            vistaTerreno.botones[fila[0]][fila[1]].setIcon(goku);
            tablero.infoCasillas[fila[0]][fila[1]].terreno=jefe1;
        }
        
     }

    public void limpiar(){
        for (int i=0;i<15;i++){
            for (int j=0;j<15;j++){
                if (tablero.infoCasillas[i][j].terreno.equals("")){
                    vistaTerreno.botones[i][j].setIcon(null);
                }
                
            }
        }
    }
    public void pintarTerrenoValido(int[][] carasDado, boolean boleano){
        boolean aux=true;
        if(boleano==true){
            aux=tablero.verificarTerreno(carasDado,jugadorActual.usuario,tablero);
            if (aux){
                for (int[]cara:carasDado){
                    if ((cara[0]>=0 && cara[0]<15 && cara[1]>=0 && cara[1]<15)){           
                        if (tablero.infoCasillas[cara[0]][cara[1]].terreno.equals("")){
                            vistaTerreno.botones[cara[0]][cara[1]].setIcon(verde);     
                        }
                    }
                }
                
            }
            else{
                for (int[]cara:carasDado){
                    if ((cara[0]>=0 && cara[0]<15 && cara[1]>=0 && cara[1]<15)){           
                        if (tablero.infoCasillas[cara[0]][cara[1]].terreno.equals("")){
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
        if (vistaTerreno.getBtnInvocar()==e.getSource()){
            
            ultimo_boton=1; //habilitar la funcionliadad para invocar 
        }
        if (ultimo_boton==1){
            for (int i=0;i<15;i++){
                for (int j=0;j<15;j++){
                   if (vistaTerreno.botones[i][j]==e.getSource()){
                        System.out.println(" haz presionado el boton !("+i+","+j+")" );
                        carasDado=dado.generarTerreno(i,j,numero,rotacion);
                        if (tablero.verificarTerreno(carasDado,jugadorActual.usuario,tablero)){
                            ponerFigura(carasDado,jugadorActual.usuario);
                            System.out.println("dado desplegado");
                            ultimo_boton=0;
                        }
                        else{
                            System.out.println("No se peude desplegar el dado");
                        }

                   }
                }
            }
        }
        if (vistaTerreno.getBtnFinalizar()==e.getSource()){
            System.out.println("finalizar turno");
            turno+=1;
            if (turno==4){
                turno=0;
                generarTurnos();

            }
            System.out.println(this.ordenTurnos);
            System.out.println(ordenTurnos.get(turno));
            jugadorActual=arregloJugadores.get(ordenTurnos.get(turno));
            
            System.out.println("turno: "+turno);
            System.out.println(jugadorActual.usuario);

        }
    }


    @Override
    public void mouseWheelMoved(MouseWheelEvent e){
        if (ultimo_boton==1){
            if (e.getWheelRotation()==1){
                System.out.println(" Cambiar a figura " + numero);
                if (numero>0){
                    numero-=1;
                }
                limpiar();
            }
            else if(e.getWheelRotation()==-1){
                System.out.println(" cambiar a figura: "+ numero);
                if (numero<10){
                    numero+=1;
                } 
                limpiar();
            }
        }
    }
    @Override
    public void mousePressed(MouseEvent e){
        if (ultimo_boton==1){
            if (e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK){
                System.out.println("rotar las figuras 90 grados");
                rotacion+=1;
                if (rotacion==4){
                    rotacion=0;
                }
                limpiar();
            }
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(ultimo_boton == 1){
            for (int i=0;i<15;i++){
                for (int j=0;j<15;j++){
                   if (vistaTerreno.botones[i][j]==e.getSource()){
                        System.out.println(" mouse sobre el boton!("+i+","+j+")" );
                        //vistaTerreno.botones[i][j].setIcon(pasto);
                        carasDado=dado.generarTerreno(i,j,numero,rotacion);
                        pintarTerrenoValido(carasDado,true);

                   }
                }
            }
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(ultimo_boton == 1){
            for (int i=0;i<15;i++){
                for (int j=0;j<15;j++){
                   if (vistaTerreno.botones[i][j]==e.getSource()){
                        System.out.println(" mouse sobre el boton!("+i+","+j+")" );
                        //vistaTerreno.botones[i][j].setIcon(pasto);
                        carasDado=dado.generarTerreno(i,j,numero,rotacion);
                        pintarTerrenoValido(carasDado,false);
                    }
                }
            }
            
        }
        
    }
  
    
}
