/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetjava;

//import jaco.mp3.player.MP3Player

//import jaco.mp3.player.MP3Player;
import java.io.File;
import java.util.Scanner;



/**
 *
 * @author I555807
 */
public class Menu {

    public void MenuData() throws InterruptedException {
        int selection;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenue sur notre jeu FINN-ECE !");
        System.out.println("Veuillez faire votre choix par la liste suivante pour commencer a jouer :");
        System.out.println("1 - Nouvelle partie");
        System.out.println("2 - Continuer votre partie");
        System.out.println("3 - Scores");
        System.out.println("4 - Regles du jeu");

        selection = sc.nextInt();

        switch (selection) {
            case 1:
                System.out.println("Lancement de votre partie en cours...");
            Timer timer = new Timer();
            //timer.AfficherTimer();
            
            
            
                
                
               //MP3Player player = new MP3Player(new File("C:\\Users\\I555807\\OneDrive - SAP SE\\Documents\\ECE Paris\\Cours\\POO\\Projet Java - FINN ECE\\ProjetJavaING3\\ProjetJava\\ECEMAN.mp3"));
                //player.play();
                Map map1 = new Map();
                map1.clearConsole();
                Scanner char1 = new Scanner(System.in);
                char s;
                
                
                map1.Tab(1);
                //int num=1;
                System.out.println("Score : 0");
                System.out.println("Temps : 0min 0s");
                map1.Afficher();
                
                map1.Partie(map1, 1);
               
                
                break;

            case 2:
                System.out.println("Reprise de votre partie en cours...");
               // Map map2 = new Map();
                //map2.map = map2.reprise();
                /*Scanner char2 = new Scanner(System.in);
                char x = char2.next().charAt(0);
                map2.Deplacer(x);
                map2.Afficher();*/
                //int num1=1;
                
               // map2.Afficher();
                
               // map2.Partie(map2, 1);
                break;
            case 3:
                System.out.println("Voici votre score :");
                System.out.println("Temps : 0s      Nombre de glaces brisées : 0");
                break;
            case 4:
                System.out.println("Les règles du jeu sont très simples. Votre but est de parcourir le plateau pour atteindre la porte de sortie de couleur rouge." + "\n"
                        + "Vous pourrez vous déplacer selon les touches suivantes :");
                System.out.println("Z : Avancer");
                System.out.println("S : Reculer");
                System.out.println("Q : Gauche");
                System.out.println("D : Droite");
                break;

        }

    }

}
