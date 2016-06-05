package Controladores;

import Controladores.ControladorTerreno2;

public class MatrizTerreno {
    public ControladorTerreno2 ct;
    public static void main(String[] args) {
        MatrizTerreno mt = new MatrizTerreno();
        mt.ct = new ControladorTerreno2();
        mt.ct.verVista(mt);
        //mt.ct.ponerDado(9, 4,"Figura1");


        
        
       
    }
    
}
