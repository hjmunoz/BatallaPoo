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
public class Principal {

    public static void main(String[] args) {

        int aleatorio, salud;
        boolean jedi = true, sith = true;

        Personaje luke = new Personaje();
        Personaje yoda = new Personaje();
        Personaje darthVader = new Personaje();

        Random rand = new Random(System.nanoTime());

        luke.setFisico(15);
        luke.setFuerza(10);
        luke.setNivel(2);
        luke.setNombre("Luke");
        luke.setPh(2);
        luke.setSalud(300);

        darthVader.setFisico(10);
        darthVader.setFuerza(40);
        darthVader.setNivel(5);
        darthVader.setNombre("Darth Vader");
        darthVader.setPh(4);
        darthVader.setSalud(500);

        yoda.setFisico(5);
        yoda.setFuerza(60);
        yoda.setNivel(10);
        yoda.setNombre("Yoda");
        yoda.setPh(10);
        yoda.setSalud(200);

        System.out.println(luke.getNombre() + " Tiene una vida de: " + luke.getSalud());
        System.out.println(yoda.getNombre() + " Tiene una vida de: " + yoda.getSalud());
        System.out.println(darthVader.getNombre() + " Tiene una vida de: " + darthVader.getSalud());
        System.out.println();
        System.out.println();
        //sistema de batalla con do while
        do {

            aleatorio = rand.nextInt(2);
            if (aleatorio == 0) {

                salud = luke.ataqueFisico();

            } else {

                salud = luke.ataqueFuerza();

            }
            System.out.println(luke.getNombre() + " ha realizado un ataque de: " + salud);
            darthVader.daño(salud);

            aleatorio = rand.nextInt(2);
            if (aleatorio == 0) {

                salud = yoda.ataqueFisico();

            } else {

                salud = yoda.ataqueFuerza();

            }
            System.out.println(yoda.getNombre() + " ha realizado un ataque de: " + salud);
            darthVader.daño(salud);

            if (darthVader.getSalud() > 0) {

                aleatorio = rand.nextInt(1);
                if (aleatorio == 0) {

                    salud = darthVader.ataqueFisico();

                } else {

                    salud = darthVader.ataqueFuerza();

                }
                System.out.println(darthVader.getNombre() + " ha realizado un ataque de: " + salud);
                aleatorio = rand.nextInt(2);
                if (aleatorio == 0) {

                    luke.daño(salud);

                } else {

                    yoda.daño(salud);

                }

                if (luke.getSalud() <= 0 && yoda.getSalud() <= 0) {

                    jedi = false;

                }

            } else {

                sith = false;

            }
            System.out.println(luke.getNombre() + " Tiene una vida de: " + luke.getSalud());
            System.out.println(yoda.getNombre() + " Tiene una vida de: " + yoda.getSalud());
            System.out.println(darthVader.getNombre() + " Tiene una vida de: " + darthVader.getSalud());
            System.out.println();
            System.out.println();
            
            try {
                System.in.read();
            } catch (Exception e) {
                
                
                
            }

        } while (jedi && sith);

    }

}
