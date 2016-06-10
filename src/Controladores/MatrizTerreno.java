package Controladores;

import Modelo.Criatura;
import Modelo.Dado;
import Modelo.JefeTerreno;
import Modelo.Jugador;
import Modelo.PuzzleDados;
import java.util.ArrayList;

public class MatrizTerreno {
    public ControladorBatalla ct;
    public ArrayList<Jugador> arreglo_jugadores;
    
    public MatrizTerreno(){
        ArrayList<Jugador> arreglo_usuario = new ArrayList<Jugador>();
        Dado[] aux;
        Criatura criatura = new Criatura(1, "Pinky", 1000, 400, 200 );
        aux= new Dado[15];
        for (int i=0; i<15; i++){
            aux[i]=new Dado(1, criatura);
        }
            
                
        Jugador jugador1,jugador2,jugador3,jugador4;
        jugador1=new Jugador("andres","hola",new PuzzleDados(aux),new JefeTerreno(1));
        jugador2=new Jugador("diego","hola",new PuzzleDados(aux),new JefeTerreno(2));
        jugador3=new Jugador("cristian","hola",new PuzzleDados(aux),new JefeTerreno(3));
        jugador4=new Jugador("nico","hola",new PuzzleDados(aux),new JefeTerreno(4));
        arreglo_usuario.add(jugador1);
        arreglo_usuario.add(jugador2);
        arreglo_usuario.add(jugador3);
        arreglo_usuario.add(jugador4);
        this.arreglo_jugadores=arreglo_usuario;
        
        
        
    }
    //public ArrayList<Jugador> arreglo_usuario = new ArrayList<Jugador>();
    public static void main(String[] args) {
        MatrizTerreno mt = new MatrizTerreno();
        mt.ct = new ControladorBatalla();
        mt.ct.verVista(mt);



        
        
       
    }
    
}
