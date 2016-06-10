/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.swing.ImageIcon;



/**
 *
 * @author Samsung
 */
public class JefeTerreno {
    public String nombre;
    public int vida;
    public String nombre_habilidad;
    public ImageIcon imagen;
    
    
    
    public JefeTerreno(int numero){
        if (numero==1){
            this.imagen = new ImageIcon(this.getClass().getResource("/Imagenes/goku.png"));
        }
        else if (numero==2){
            this.imagen = new ImageIcon(this.getClass().getResource("/Imagenes/Kaio-Sama.png"));
        }
        else if (numero==3){
            this.imagen = new ImageIcon(this.getClass().getResource("/Imagenes/goku.png"));
        }
        else if (numero==4){
            this.imagen = new ImageIcon(this.getClass().getResource("/Imagenes/goku.png"));
        }
    }
        /*this.nombre=nombre;
        //Construir de forma diferente para el nombre que se entrega
        if (nombre.equals("Goku")){ 
        }
        else if (nombre.equals("Vegeta")){
        }
        else if (nombre.equals("Zolezzi")){
        }
        else if (nombre.equals("Mr.Satan")){

        }

    }
*/
    
    
    
}
