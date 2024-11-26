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
    public String nome = "Gabriele";
    public String cognome = "Darco";
    public double voto_informatica = 4;
    public double voto_tps = 8;
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
    