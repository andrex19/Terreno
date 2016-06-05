package Modelo;

public class Dado {
    public int carasDado[][];

    public Dado() {
        this.carasDado = new int[6][2];
    }

    public int[][] generarTerreno(int f,int c,int num,int rot){
    int[][] carasDado =  new int[6][2];
        if (num==0){
       
                //figura 1,1
                carasDado[0][0]=f;
                carasDado[0][1]=c;
                carasDado[1][0]=f+1;
                carasDado[1][1]=c;
                carasDado[2][0]=f+2;
                carasDado[2][1]=c;
                carasDado[3][0]=f+3;
                carasDado[3][1]=c;
                carasDado[4][0]=f+2;
                carasDado[4][1]=c-1;
                carasDado[5][0]=f+2;
                carasDado[5][1]=c+1;
        }
        else if (num==1){
                //figura 2,1
                carasDado[0][0]=f;
                carasDado[0][1]=c;
                carasDado[1][0]=f-1;
                carasDado[1][1]=c;
                carasDado[2][0]=f-2;
                carasDado[2][1]=c;
                carasDado[3][0]=f-3;
                carasDado[3][1]=c;
                carasDado[4][0]=f-3;
                carasDado[4][1]=c-1;
                carasDado[5][0]=f-3;
                carasDado[5][1]=c+1;
        }
        else if (num==2){
                //figura 1,2
                carasDado[0][0]=f;
                carasDado[0][1]=c;
                carasDado[1][0]=f-1;
                carasDado[1][1]=c;
                carasDado[2][0]=f-2;
                carasDado[2][1]=c;
                carasDado[3][0]=f-2;
                carasDado[3][1]=c-1;
                carasDado[4][0]=f-3;
                carasDado[4][1]=c-1;
                carasDado[5][0]=f-4;
                carasDado[5][1]=c-1;
        }
        else if (num==3){
                //figura 2, 2  
                carasDado[0][0]=f;
                carasDado[0][1]=c;
                carasDado[1][0]=f-1;
                carasDado[1][1]=c;
                carasDado[2][0]=f-2;
                carasDado[2][1]=c;
                carasDado[3][0]=f-2;
                carasDado[3][1]=c+1;
                carasDado[4][0]=f-3;
                carasDado[4][1]=c+1;
                carasDado[5][0]=f-4;
                carasDado[5][1]=c+1;
        }
        else if (num==4){
                //figura1,3
                carasDado[0][0]=f;
                carasDado[0][1]=c;
                carasDado[1][0]=f-1;
                carasDado[1][1]=c;
                carasDado[2][0]=f-1;
                carasDado[2][1]=c+1;
                carasDado[3][0]=f-2;
                carasDado[3][1]=c+1;
                carasDado[4][0]=f-2;
                carasDado[4][1]=c+2;
                carasDado[5][0]=f-3;
                carasDado[5][1]=c+2;
        }
        else if (num==5){
                //figura 1,4
                carasDado[0][0]=f;
                carasDado[0][1]=c;
                carasDado[1][0]=f;
                carasDado[1][1]=c-1;
                carasDado[2][0]=f-1;
                carasDado[2][1]=c-1;
                carasDado[3][0]=f-2;
                carasDado[3][1]=c-1;
                carasDado[4][0]=f-3;
                carasDado[4][1]=c-1;
                carasDado[5][0]=f-3;
                carasDado[5][1]=c-2;
        }
        else if (num==6){
                //figura 1,5
                carasDado[0][0]=f;
                carasDado[0][1]=c;
                carasDado[1][0]=f-1;
                carasDado[1][1]=c;
                carasDado[2][0]=f-1;
                carasDado[2][1]=c-1;
                carasDado[3][0]=f-2;
                carasDado[3][1]=c-1;
                carasDado[4][0]=f-3;
                carasDado[4][1]=c-1;
                carasDado[5][0]=f-2;
                carasDado[5][1]=c-2;
        }
        else if (num==7){
                // esta mala!
                carasDado[0][0]=f;
                carasDado[0][1]=c;
                carasDado[1][0]=f-1;
                carasDado[1][1]=c;
                carasDado[2][0]=f-2;
                carasDado[2][1]=c;
                carasDado[3][0]=f-2;
                carasDado[3][1]=c+1;
                carasDado[4][0]=f-3;
                carasDado[4][1]=c+1;
                carasDado[5][0]=f-4;
                carasDado[5][1]=c+1;
        }
        else if (num==8){
                //figura 2,3
                carasDado[0][0]=f;
                carasDado[0][1]=c;
                carasDado[1][0]=f-1;
                carasDado[1][1]=c;
                carasDado[2][0]=f-1;
                carasDado[2][1]=c-1;
                carasDado[3][0]=f-2;
                carasDado[3][1]=c-1;
                carasDado[4][0]=f-2;
                carasDado[4][1]=c-2;
                carasDado[5][0]=f-3;
                carasDado[5][1]=c-2;
        }
        else if (num==9){
                //figura2,4
                carasDado[0][0]=f;
                carasDado[0][1]=c;
                carasDado[1][0]=f;
                carasDado[1][1]=c+1;
                carasDado[2][0]=f-1;
                carasDado[2][1]=c+1;
                carasDado[3][0]=f-2;
                carasDado[3][1]=c+1;
                carasDado[4][0]=f-3;
                carasDado[4][1]=c+1;
                carasDado[5][0]=f-3;
                carasDado[5][1]=c+2;
        }
        else if (num==10){
                //figura 2,5
                carasDado[0][0]=f;
                carasDado[0][1]=c;
                carasDado[1][0]=f-1;
                carasDado[1][1]=c;
                carasDado[2][0]=f-1;
                carasDado[2][1]=c+1;
                carasDado[3][0]=f-2;
                carasDado[3][1]=c+1;
                carasDado[4][0]=f-3;
                carasDado[4][1]=c+1;
                carasDado[5][0]=f-2;
                carasDado[5][1]=c+2;
        }
        if (rot==1){
            girarTerreno(carasDado);
        }
            
        
        else if (rot==2){
            girarTerreno(carasDado);
            girarTerreno(carasDado);
        }
        else if (rot==3){
            girarTerreno(carasDado);
            girarTerreno(carasDado);
            girarTerreno(carasDado);
            
        }
    return carasDado;
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
    
    

    
   /* public int[][] forma1(int fila,int columna){
        int carasDado[][] = {{fila-2,columna},{fila-1,columna},{fila,columna},{fila+1,columna+1},{fila+2,columna+2}};
        return carasDado[][];*/
    
    
}