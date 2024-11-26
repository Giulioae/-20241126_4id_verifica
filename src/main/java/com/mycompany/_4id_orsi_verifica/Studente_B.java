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
    public String nome = "Antonio";
    public String cognome = "Romano";
    public double voto_informatica = 2;
    public double voto_tps = 4;
    public double voto_sistemi = 6;
    public double media_voti;
  
// metodo che si occupa della media aritmetica dei voti     
    
    public double media_voti(){
    media_voti = (voto_informatica + voto_tps + voto_sistemi) / 3;
    System.out.println("la media é : " + nome);
    System.out.println(" " + cognome);
    return media_voti;
}
}

