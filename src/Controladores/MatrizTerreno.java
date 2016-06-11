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
        Dado[] aux1;
        Dado[] aux2;
        Dado[] aux3;
        Dado[] aux4;

        aux1= new Dado[15];
        for (int i=0; i<15; i++){
            aux1[i]=new Dado(1, new Criatura(1, "Pinky", 1000, 400, 200 ));
        }
        aux2= new Dado[15];
        for (int i=0; i<15; i++){
            aux2[i]=new Dado(2, new Criatura(1, "Pinky", 1000, 400, 200 ));
        }
        aux3= new Dado[15];
        for (int i=0; i<15; i++){
            aux3[i]=new Dado(3, new Criatura(1, "Pinky", 1000, 400, 200 ));
        }
        aux4= new Dado[15];
        for (int i=0; i<15; i++){
            aux4[i]=new Dado(4, new Criatura(1, "Pinky", 1000, 400, 200 ));
        }
            
                
        Jugador jugador1,jugador2,jugador3,jugador0;
        jugador0=new Jugador("andres","hola",new PuzzleDados(aux1),new JefeTerreno(1));
        jugador1=new Jugador("diego","hola",new PuzzleDados(aux2),new JefeTerreno(2));
        jugador2=new Jugador("cristian","hola",new PuzzleDados(aux3),new JefeTerreno(3));
        jugador3=new Jugador("nico","hola",new PuzzleDados(aux4),new JefeTerreno(4));
        arreglo_usuario.add(jugador0);
        arreglo_usuario.add(jugador1);
        arreglo_usuario.add(jugador2);
        arreglo_usuario.add(jugador3);
        this.arreglo_jugadores=arreglo_usuario;
}
    //public ArrayList<Jugador> arreglo_usuario = new ArrayList<Jugador>();
    public static void main(String[] args) {
        MatrizTerreno mt = new MatrizTerreno();
        mt.ct = new ControladorBatalla();
        mt.ct.verVista(mt);



        
        
       
    }
    
}
