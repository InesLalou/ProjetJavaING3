/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetjava;

import java.util.Scanner;

/**
 *
 * @author I555807
 */
public class Menu {
    
    
    public void MenuData() {
        int selection;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenue sur notre jeu FINN-ECE !");
        System.out.println("Veuillez faire votre choix par la liste suivante pour commencer à jouer :");
        System.out.println("1 - Nouvelle partie");
        System.out.println("2 - Continuer votre partie");
        System.out.println("3 - Scores");
        System.out.println("4 - Règles du jeu");
        
        
        selection = sc.nextInt(); 
        
        switch(selection){
            case 1:
            System.out.println("Lancement de votre partie en cours...");
            break;
            case 2:
            System.out.println("Reprise de votre partie en cours...");
            break;
            case 3:
            System.out.println("Voici votre score :");
            System.out.println("Temps : 0s      Nombre de glaces brisées : 0");
            break;
            case 4:
            System.out.println("Les règles du jeu sont très simples. Votre but est de parcourir le plateau pour atteindre la porte de sortie de couleur rouge." + "\n"
                    + "Vous pourrez vous déplacer selon les touches suivantes :" );
            System.out.println("Z : Avancer");
            System.out.println("S : Reculer");
            System.out.println("Q : Gauche");
            System.out.println("D : Droite");
            break;
                
        }
  
    }
     
}
