/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._4id_orsi_verifica;

/**
 *
 * @author ospite
 */


/*
Progettare e definire il codice per un programma che gestisca una scuola con studenti e docenti. 
Ogni studente ha cognome, nome, e 3 tre voti (1 per ogni materia), 
mentre ogni docente ha un cognome e una materia che insegna
*/


public class App {
       
    public static void main(String[] args) {
    // creazione di due nuovi oggetti il primostudente per la relativa classe Studente_A    
    Studente_A primostudente = new Studente_A();
    System.out.println("e : " + primostudente.media_voti()); // stampa dell'output a schermo del messaggio + nome dell'oggetto.media_voti ovvero il metodo per le media aritmetica
    System.out.println("voti dello studente : " + primostudente.cognome);
    // creazione del secondo oggetto secondostudente per la relativa classe Studente_B
    Studente_B secondostudente = new Studente_B(); 
    System.out.println("e :" + secondostudente.media_voti()); // stampa dell'output a schermo del messaggio + nome dell'oggetto.media_voti ovvero il metodo per le media aritmetica
    System.out.println("voti dello studente : " + secondostudente.cognome);
   
    } 
}
