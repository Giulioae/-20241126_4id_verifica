/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._4id_orsi_verifica;

/**
 *
 * @author ospite
 */

// studente numero 2 - con relativi dati personali e voti presi:

public class Studente_B {
    public String nome = "Antonio"; // usiamo String per le stringhe
    public String cognome = "Romano"; // usiamo String per le stringhe
    public double voto_informatica = 2; // usiamo double per i numeri con la virgola 
    public double voto_tps = 4; // usiamo double per i numeri con la virgola
    public double voto_sistemi = 6; // usiamo double per i numeri con la virgola
    public double media_voti; // usiamo double per i numeri con la virgola
  
// metodo che si occupa della media aritmetica dei voti     
    
    public double media_voti(){
    media_voti = (voto_informatica + voto_tps + voto_sistemi) / 3; // metodo per media voti /3 per il numero di voti ottenuti da Studente_A
    System.out.println("la media é : " + media_voti);
    return media_voti;
}
}

