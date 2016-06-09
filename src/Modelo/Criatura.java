/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Andres Muñoz Bravo
 */
public class Criatura {
        //Atributos//
    public String nombre;
    public int puntosDeVida;
    public int nivel;
    public int ataque;
    public int defensa;
    public int movimiento;
    public static int numero;
    
    public Criatura(){
        this.nombre="criatura " + numero;
        this.numero+=1;
        this.puntosDeVida=1000;
        this.nivel=1;
        this.ataque=400;
        this.defensa=200;
        this.movimiento=1;
                        
    }
    
    public void Atacar(Criatura defensora){
        int Daño;
        if (this.ataque>defensora.defensa){

            Daño =  this.ataque - defensora.defensa;
            defensora.puntosDeVida = defensora.puntosDeVida - Daño;
            System.out.println(this.nombre+" ha atacado a "+defensora.nombre);
          }

        else if (this.ataque<defensora.defensa){
            Daño = this.ataque - this.defensa;
            this.puntosDeVida = this.puntosDeVida - Daño;
            System.out.println(this.nombre+" se quita a sí mismo");
        }
    }
    
}
