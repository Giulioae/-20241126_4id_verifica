package com.mycompany._4id_orsi_verifica;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ospite
 */

// studente numero 1 - con relativi dati personali e voti presi:

public class Studente_A {
    public String nome = "Gabriele"; // usiamo String per le stringhe 
    public String cognome = "Darco"; // usiamo String per le stringhe
    public double voto_informatica = 4; // usiamo double per i numeri con la virgola 
    public double voto_tps = 8; // usiamo double per i numeri con la virgola 
    public double voto_sistemi = 6; // usiamo double per i numeri con la virgola 
    public double media_voti; // usiamo double per i numeri con la virgola 
    
// metodo che si occupa della media aritmetica dei voti 
    
    public double media_voti(){
    media_voti = (voto_informatica + voto_tps + voto_sistemi) / 3; // metodo per media voti /3 per il numero di voti ottenuti da Studente_A
    System.out.println("la media é : " + media_voti); 
    return media_voti;
}
}
    