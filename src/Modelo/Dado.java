package Modelo;

import java.util.ArrayList;

public class Dado {
    public int posicionCarasDado[][];
    public Criatura criatura;
    public String[] caras;
    

    public Dado(int numero, Criatura criatura) {
        if (numero==1){
            this.posicionCarasDado = new int[6][2];
            this.criatura=criatura;
            this.caras[0]="Mov";
            this.caras[1]="Inv";
            this.caras[2]="Atk";
            this.caras[3]="Atk";
            this.caras[4]="Mov";
            this.caras[5]="Inv";
            
        }
        if (numero==2){
            this.posicionCarasDado = new int[6][2];
            this.criatura=criatura;
            this.caras[0]="Tramp";
            this.caras[1]="Inv";
            this.caras[2]="AtkX2";
            this.caras[3]="Atk";
            this.caras[4]="Inv";
            this.caras[5]="Tramp";
        }
        if (numero==3){
            this.posicionCarasDado = new int[6][2];
            this.criatura=criatura;
            this.caras[0]="MovX3";
            this.caras[1]="Inv";
            this.caras[2]="Atk";
            this.caras[3]="Atk";
            this.caras[4]="Mov";
            this.caras[5]="MagX2";
        }
        if (numero==4){
            this.posicionCarasDado = new int[6][2];
            this.criatura=criatura;
            this.caras[0]="Inv";
            this.caras[1]="Inv";
            this.caras[2]="AtkX4";
            this.caras[3]="AtkX3";
            this.caras[4]="AtkX2";
            this.caras[5]="Atk";
        }
        
        
    }

    public int[][] generarTerreno(int f,int c,int num,int rot){
    int[][] posicionCarasDado =  new int[6][2];
        if (num==0){
       
                //figura 1,1
                posicionCarasDado[0][0]=f;
                posicionCarasDado[0][1]=c;
                posicionCarasDado[1][0]=f+1;
                posicionCarasDado[1][1]=c;
                posicionCarasDado[2][0]=f+2;
                posicionCarasDado[2][1]=c;
                posicionCarasDado[3][0]=f+3;
                posicionCarasDado[3][1]=c;
                posicionCarasDado[4][0]=f+2;
                posicionCarasDado[4][1]=c-1;
                posicionCarasDado[5][0]=f+2;
                posicionCarasDado[5][1]=c+1;
        }
        else if (num==1){
                //figura 2,1
                posicionCarasDado[0][0]=f;
                posicionCarasDado[0][1]=c;
                posicionCarasDado[1][0]=f-1;
                posicionCarasDado[1][1]=c;
                posicionCarasDado[2][0]=f-2;
                posicionCarasDado[2][1]=c;
                posicionCarasDado[3][0]=f-3;
                posicionCarasDado[3][1]=c;
                posicionCarasDado[4][0]=f-3;
                posicionCarasDado[4][1]=c-1;
                posicionCarasDado[5][0]=f-3;
                posicionCarasDado[5][1]=c+1;
        }
        else if (num==2){
                //figura 1,2
                posicionCarasDado[0][0]=f;
                posicionCarasDado[0][1]=c;
                posicionCarasDado[1][0]=f-1;
                posicionCarasDado[1][1]=c;
                posicionCarasDado[2][0]=f-2;
                posicionCarasDado[2][1]=c;
                posicionCarasDado[3][0]=f-2;
                posicionCarasDado[3][1]=c-1;
                posicionCarasDado[4][0]=f-3;
                posicionCarasDado[4][1]=c-1;
                posicionCarasDado[5][0]=f-4;
                posicionCarasDado[5][1]=c-1;
        }
        else if (num==3){
                //figura 2, 2  
                posicionCarasDado[0][0]=f;
                posicionCarasDado[0][1]=c;
                posicionCarasDado[1][0]=f-1;
                posicionCarasDado[1][1]=c;
                posicionCarasDado[2][0]=f-2;
                posicionCarasDado[2][1]=c;
                posicionCarasDado[3][0]=f-2;
                posicionCarasDado[3][1]=c+1;
                posicionCarasDado[4][0]=f-3;
                posicionCarasDado[4][1]=c+1;
                posicionCarasDado[5][0]=f-4;
                posicionCarasDado[5][1]=c+1;
        }
        else if (num==4){
                //figura1,3
                posicionCarasDado[0][0]=f;
                posicionCarasDado[0][1]=c;
                posicionCarasDado[1][0]=f-1;
                posicionCarasDado[1][1]=c;
                posicionCarasDado[2][0]=f-1;
                posicionCarasDado[2][1]=c+1;
                posicionCarasDado[3][0]=f-2;
                posicionCarasDado[3][1]=c+1;
                posicionCarasDado[4][0]=f-2;
                posicionCarasDado[4][1]=c+2;
                posicionCarasDado[5][0]=f-3;
                posicionCarasDado[5][1]=c+2;
        }
        else if (num==5){
                //figura 1,4
                posicionCarasDado[0][0]=f;
                posicionCarasDado[0][1]=c;
                posicionCarasDado[1][0]=f;
                posicionCarasDado[1][1]=c-1;
                posicionCarasDado[2][0]=f-1;
                posicionCarasDado[2][1]=c-1;
                posicionCarasDado[3][0]=f-2;
                posicionCarasDado[3][1]=c-1;
                posicionCarasDado[4][0]=f-3;
                posicionCarasDado[4][1]=c-1;
                posicionCarasDado[5][0]=f-3;
                posicionCarasDado[5][1]=c-2;
        }
        else if (num==6){
                //figura 1,5
                posicionCarasDado[0][0]=f;
                posicionCarasDado[0][1]=c;
                posicionCarasDado[1][0]=f-1;
                posicionCarasDado[1][1]=c;
                posicionCarasDado[2][0]=f-1;
                posicionCarasDado[2][1]=c-1;
                posicionCarasDado[3][0]=f-2;
                posicionCarasDado[3][1]=c-1;
                posicionCarasDado[4][0]=f-3;
                posicionCarasDado[4][1]=c-1;
                posicionCarasDado[5][0]=f-2;
                posicionCarasDado[5][1]=c-2;
        }
        else if (num==7){
                // esta mala!
                posicionCarasDado[0][0]=f;
                posicionCarasDado[0][1]=c;
                posicionCarasDado[1][0]=f-1;
                posicionCarasDado[1][1]=c;
                posicionCarasDado[2][0]=f-2;
                posicionCarasDado[2][1]=c;
                posicionCarasDado[3][0]=f-2;
                posicionCarasDado[3][1]=c+1;
                posicionCarasDado[4][0]=f-3;
                posicionCarasDado[4][1]=c+1;
                posicionCarasDado[5][0]=f-4;
                posicionCarasDado[5][1]=c+1;
        }
        else if (num==8){
                //figura 2,3
                posicionCarasDado[0][0]=f;
                posicionCarasDado[0][1]=c;
                posicionCarasDado[1][0]=f-1;
                posicionCarasDado[1][1]=c;
                posicionCarasDado[2][0]=f-1;
                posicionCarasDado[2][1]=c-1;
                posicionCarasDado[3][0]=f-2;
                posicionCarasDado[3][1]=c-1;
                posicionCarasDado[4][0]=f-2;
                posicionCarasDado[4][1]=c-2;
                posicionCarasDado[5][0]=f-3;
                posicionCarasDado[5][1]=c-2;
        }
        else if (num==9){
                //figura2,4
                posicionCarasDado[0][0]=f;
                posicionCarasDado[0][1]=c;
                posicionCarasDado[1][0]=f;
                posicionCarasDado[1][1]=c+1;
                posicionCarasDado[2][0]=f-1;
                posicionCarasDado[2][1]=c+1;
                posicionCarasDado[3][0]=f-2;
                posicionCarasDado[3][1]=c+1;
                posicionCarasDado[4][0]=f-3;
                posicionCarasDado[4][1]=c+1;
                posicionCarasDado[5][0]=f-3;
                posicionCarasDado[5][1]=c+2;
        }
        else if (num==10){
                //figura 2,5
                posicionCarasDado[0][0]=f;
                posicionCarasDado[0][1]=c;
                posicionCarasDado[1][0]=f-1;
                posicionCarasDado[1][1]=c;
                posicionCarasDado[2][0]=f-1;
                posicionCarasDado[2][1]=c+1;
                posicionCarasDado[3][0]=f-2;
                posicionCarasDado[3][1]=c+1;
                posicionCarasDado[4][0]=f-3;
                posicionCarasDado[4][1]=c+1;
                posicionCarasDado[5][0]=f-2;
                posicionCarasDado[5][1]=c+2;
        }
        if (rot==1){
            girarTerreno(posicionCarasDado);
        }
            
        
        else if (rot==2){
            girarTerreno(posicionCarasDado);
            girarTerreno(posicionCarasDado);
        }
        else if (rot==3){
            girarTerreno(posicionCarasDado);
            girarTerreno(posicionCarasDado);
            girarTerreno(posicionCarasDado);
            
        }
    return posicionCarasDado;
        }
    public int[][] girarTerreno(int[][] carasDado){
        int f = carasDado[0][0];
        int c = carasDado[0][1];
        for (int[]posicion:carasDado){
            posicion[0]=posicion[0]-f;
            posicion[1]=posicion[1]-c;
        }
        for (int[]posicion:carasDado){
            int y=posicion[0];
            int x=posicion[1];
            posicion[0]=-x;
            posicion[1]=y;
        }
        for (int[]posicion:carasDado){
            posicion[0]=posicion[0]+f;
            posicion[1]=posicion[1]+c;
        }
    return carasDado;
    }
    //Metodos//
    //arraylist caras con las 6 caras del dado
    //arraylist puntos del Usuario en el orden (atk, mov, mag, tramp,inv)
    public void lanzarDado(String [] caras, int[] puntos){
        int n = (int)Math.round((5)*Math.random());
        String caraDado = this.caras[n];
        if(caraDado == "Atk"){
            puntos[0] = puntos[0] + 1;
            System.out.println("Obtuvo 1 punto de Ataque");
        }
        else if(caraDado == "Mov"){
            puntos[1] = puntos[1] + 1;         
            System.out.println("Obtuvo 1 punto de Movimiento");    
        }
        else if(caraDado == "Mag"){
            puntos[2] = puntos[2] + 1;
            System.out.println("Obtuvo 1 punto de Magia");
        }
        else if(caraDado == "Tramp"){
            puntos[3] = puntos[3] + 1;
            System.out.println("Obtuvo 1 punto de Trampa");
        }
        else if(caraDado == "Inv"){
            puntos[4] = puntos[4] + 1;
            System.out.println("Obtuvo 1 punto de Invocacion");
        }
        if(caraDado == "AtkX2"){
            puntos[0] = puntos[0] + 2;
            System.out.println("Obtuvo 2 punto de Ataque");
        }
        else if(caraDado == "MovX2"){
            puntos[1] = puntos[1] + 2;          
            System.out.println("Obtuvo 2 punto de Movimiento");    
        }
        else if(caraDado == "MagX2"){
            puntos[2] = puntos[2] + 2;
            System.out.println("Obtuvo 2 punto de Magia");
        }
        else if(caraDado == "TrampX2"){
            puntos[3] = puntos[3] + 2;
            System.out.println("Obtuvo 2 punto de Trampa");
        }
        if(caraDado == "AtkX3"){
            puntos[0] = puntos[0] + 3;
            System.out.println("Obtuvo 3 punto de Ataque");
        }
        else if(caraDado == "MovX3"){
            puntos[1] = puntos[1] + 3;         
            System.out.println("Obtuvo 3 punto de Movimiento");    
        }
        else if(caraDado == "MagX3"){
            puntos[2] = puntos[2] + 3;
            System.out.println("Obtuvo 3 punto de Magia");
        }
        else if(caraDado == "TrampX3"){
            puntos[3] = puntos[3] + 3; 
            System.out.println("Obtuvo 3 punto de Trampa");
        }
        
    }
}


    

    
   /* public int[][] forma1(int fila,int columna){
        int carasDado[][] = {{fila-2,columna},{fila-1,columna},{fila,columna},{fila+1,columna+1},{fila+2,columna+2}};
        return carasDado[][];*/
    
    

