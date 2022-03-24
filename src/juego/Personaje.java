/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.util.Random;

/**
 *
 * @author hecto
 */
public class Personaje {
    
    private int salud, fisico, fuerza, ph, nivel;
    private String nombre;
    private Random rand = new Random(System.nanoTime());
    
    //sets and get
    //this.salud => hace referencia a la variable de la clase.
    //this.salud = salud=>hace referencia al parametro del metodo.

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getFisico() {
        return fisico;
    }

    public void setFisico(int fisico) {
        this.fisico = fisico;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getPh() {
        return ph;
    }

    public void setPh(int ph) {
        this.ph = ph;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //metodos para Atacar
    
    public int ataqueFisico(){
        
        int aleatorio = rand.nextInt(2);
       return nivel * fisico * aleatorio;
        
    }
    
    public int ataqueFuerza(){
        
        if(ph > 0){
            
            ph = ph-1;
            return nivel * fuerza;
        }
        else{
            return 0;
        }
    }
    
    public void daño(int salud){
        
        this.salud -= salud;
        
    }
}
