/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Model.MapModel;
import Controller.MapController;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author lyseb
 */
public class MapView {
  
    
    public char Jouer(int num){
         Scanner char1 = new Scanner(System.in);
        System.out.println("Fin du Tableau "+num+" : Félicitations ! vous aurez des bonbons");

        System.out.println("Voulez-vous continuer ? Tapez Y");
        System.out.println("Voulez-vous quitter et sauvegarder votre partie ? Tapez Q");
       char s = char1.next().charAt(0);
        return s;
    }
    public char Stop(){
        Scanner char1 = new Scanner(System.in);
        System.out.println("Voulez-vous quitter et sauvegarder votre partie ? Tapez Q");
       char s = char1.next().charAt(0);
        return s;
    }
    public void Afficher(char[][] map) {
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 19; j++) {
                /*if(map[i][j]=='#'){
                    System.out.print("5");
                }
                if(map[i][j]=='M'){
                    System.out.print("0");
                }
                if(map[i][j]=='E'){
                    System.out.print('1');
                }
                if(map[i][j]=='R'){
                    System.out.print('7');
                }
                if(map[i][j]=='g'){
                    System.out.print("1");
                }
                if(map[i][j]=='P'){
                    System.out.print("2");
                }
                if(map[i][j]=='G'){
                    System.out.print("4");
                }
                if(map[i][j]=='o'){
                    System.out.print("3");
                }
                if(map[i][j]=='T'){
                    System.out.print("6");
                }*/
                System.out.print(map[i][j]);
            }
            System.out.println("");
        }
    }
    public void clearConsole(){
    try {
  if(System.getProperty("os.name" ).startsWith("Windows" ))
    Runtime.getRuntime().exec("cls" );
  else
    Runtime.getRuntime().exec("clear" );
} catch(IOException excpt) {
  for(int i=0;i<100;i++)
    System.out.println();
}
}
    public void Gagner(){
        System.out.println("Felicitation, vous avez fini le jeu !");
        System.out.println(" ");
    }
}
