/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo4;

/**
 *
 * @author Juliana
 */
//EJERCICIO RESUELTO #4
import java.util.Scanner;
public class POO4 {

    public static void main(String[] args) {
        int edjuan, edalber, edana, edmama;
        System.out.println("Ingrese la edad de Juan:"); //Ingreso edad de Juan
        Scanner entrada = new Scanner(System.in);
        edjuan = entrada.nextInt(); //edad de Juan
        edalber = 2 * (edjuan/3); //edad de Alberto
        edana = 4 * (edjuan/3); //edad de Ana
        edmama = edjuan + edalber + edana; //edad de Mama
        System.out.println("Edad de Juan: " + edjuan);
        System.out.println("Edad de Alberto: " + edalber);
        System.out.println("Edad de Ana: " + edana);
        System.out.println("Edad de Mama: " + edmama);
    }
}

