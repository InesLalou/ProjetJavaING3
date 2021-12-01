/* 

 * To change this license header, choose License Headers in Project Properties. 

 * To change this template file, choose Tools | Templates 

 * and open the template in the editor. 

 */
package View;

import java.util.Scanner;

import javax.swing.JFrame;

/**  *
 *
 *
 * @author ine28  *
 */
public class MenuView {

    public MenuView() {

    }

    public int ChoixGraphiqueOuConsole() {

        int selection;

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenue sur notre jeu FINN-ECE");

        System.out.println("Souhaitez-vous jouer au jeu en mode console ou graphique ?");

        System.out.println("1 - Mode Console");

        System.out.println("2 - Mode Graphique");
        
        System.out.println("3 - Quitter");

        selection = sc.nextInt();

        return selection;

    }

    public void AfficherMenuGraphique() {

        JFrame jframe = new JFrame();
        jframe.setSize(320, 240);
        jframe.setTitle("Jeu FINN-ECE");
        jframe.setVisible(true);
        jframe.setAlwaysOnTop(true);

    }

    public int Menu() {
        int selection;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenue sur notre jeu FINN-ECE !");
        System.out.println("Veuillez faire votre choix par la liste suivante pour commencer a jouer :");
        System.out.println("1 - Nouvelle partie");
        System.out.println("2 - Continuer votre partie");
        System.out.println("3 - Scores");
        System.out.println("4 - Regles du jeu");
        System.out.println("5 - Quitter");
        selection = sc.nextInt();
        return selection;
    }

    public void Score() {

        System.out.println("Voici votre score :");

        System.out.println("Temps : 0s      Nombre de glaces brisées : 0");

    }

    public void Regles() {

        System.out.println("Les règles du jeu sont très simples. Votre but est de parcourir le plateau pour atteindre la porte de sortie de couleur rouge." + "\n"
                + "Vous pourrez vous déplacer selon les touches suivantes :");

        System.out.println("Z : Avancer");

        System.out.println("S : Reculer");

        System.out.println("Q : Gauche");

        System.out.println("D : Droite");

    }

    public void InitPartie() {

        System.out.println("Niveau 1");

        System.out.println("Score : 0");

        System.out.println("Temps : 0min 0s");

    }

    public void QuitterPartie() {

        System.out.println("Merci d'avoir joue a notre jeu");

        System.out.println("A bientot !");

    }

}
