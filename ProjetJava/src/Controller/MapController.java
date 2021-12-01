/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author lyseb
 */
import Model.MapModel;
import Model.MenuModel;
import View.MapView;
import View.MenuView;
import View.TimerView;
import java.util.Scanner;

/*public class MapController {
    Timer timer = new Timer();
    MapModel levelModel = new MapModel();
    MapView view = new MapView(); 
    MenuView menuview = new MenuView();
    MenuModel menuModel;
   int num =1;
    
    
    void Deplacer(char d){
        
                switch(d){
                    case 'z':
                        levelModel.haut();
                    case 's':
                        levelModel.bas();
                    case 'd':
                      levelModel.droite();
                    case 'q':
                        
                        levelModel.gauche();
                }
    }
   public void Start(MapModel mapActuel, int num){
                
                  
                  menuview.InitPartie();
                  levelModel.Tab(num);
                  timer.start();
                 
                view.Afficher(levelModel.getMap());
                Scanner char1 = new Scanner(System.in);
                char s;
                
                do {
                                    
                    s = char1.next().charAt(0);
                    //clearConsole();
                    
                    Deplacer(s);
                    System.out.println("Niveau : "+num);
                    System.out.println("Score : "+levelModel.compteur);
                    timer.getElapsedTime();
                    view.Afficher(levelModel.getMap());
                    
                } while (levelModel.casePred != 'P' && s !='p');

                
                if (levelModel.casePred == 'P') {
                }
                char r = view.Jouer(num);
                switch(r){
                   case 'y':
                   num++;
                MapModel mapPro = new MapModel();
                Start(mapPro, num); 
                   case 'Q':
                    System.out.println("Votre partie a été sauvegardée. A bientôt !");   
                   
               }
   }
   
}*/
public class MapController {

    TimerController timercontroller = new TimerController();
    TimerView timerview = new TimerView();
    MapModel levelModel = new MapModel();
    MapView view = new MapView();
    MenuView menuview = new MenuView();
    MenuModel menuModel;
    SaveController savecontroller = new SaveController();
    int num = 1;

    void Deplacer(char d) {

        switch (d) {
            case 'z':
                levelModel.haut();
                break;
            case 's':
                levelModel.bas();
                break;
            case 'd':
                levelModel.droite();
                break;
            case 'q':
                levelModel.gauche();
                break;
        }
    }

    public void Start(int num) {
        levelModel.compteur = 0;
        menuview.InitPartie();
        levelModel.Tab(num);
        timercontroller.timerstart();
        view.Afficher(levelModel.getMap());
        Scanner char1 = new Scanner(System.in);
        char s;
        long timeEnnemi = 0;
        int compteur = 0;

        do {
            //timeEnnemi = timercontroller.getTimeElapsedSecs();         
            s = char1.next().charAt(0);
            view.clearConsole();
            //system("cls");
            /*if(timeEnnemi==2 & levelModel.ennemiBool==true){
                        System.out.println("Test"); 
                        levelModel.deplacementEnnemi();
                        System.out.println("Niveau : "+num);
                        System.out.println("Score : "+levelModel.compteur);
                        
                        timercontroller.timeraffichage();
                        view.Afficher(levelModel.getMap());
                        timeEnnemi=0;
                    }*/
            Deplacer(s);
            compteur++;
            //System.out.println("Compteur " + compteur);
            if (compteur == 3) {
                if (levelModel.ennemiBool == true) {
                    System.out.println("test");
                    compteur = 0;

                    levelModel.deplacementEnnemi();
                }
            }
            levelModel.Collision();
            if (levelModel.getCollision() == true) {
                System.out.println("Perdu ! ECEMAN est tombé sur un ennemi");
                System.out.println("Veuillez recommencer la partie");
                levelModel.collision = false;
                Start(num);
            }

            System.out.println("Niveau : " + num);
            System.out.println("Score : " + levelModel.compteur);
            timercontroller.timeraffichage();
            view.Afficher(levelModel.getMap());

            if (levelModel.getMap()[levelModel.eceman.getx() + 1][levelModel.eceman.gety()] == 'o' || levelModel.getMap()[levelModel.eceman.getx() + 1][levelModel.eceman.gety()] == 'M') {
                if (levelModel.getMap()[levelModel.eceman.getx()][levelModel.eceman.gety() + 1] == 'o' || levelModel.getMap()[levelModel.eceman.getx()][levelModel.eceman.gety() + 1] == 'M') {
                    if (levelModel.getMap()[levelModel.eceman.getx() - 1][levelModel.eceman.gety()] == 'o' || levelModel.getMap()[levelModel.eceman.getx() - 1][levelModel.eceman.gety()] == 'M') {
                        if (levelModel.getMap()[levelModel.eceman.getx()][levelModel.eceman.gety() - 1] == 'o' || levelModel.getMap()[levelModel.eceman.getx()][levelModel.eceman.gety() - 1] == 'M') {
                            if (levelModel.casePred != 'P') {
                                view.clearConsole();
                                System.out.println("Perdu ! Votre personnage est coincé ");
                                System.out.println("Recommencez la partie");
                                Start(num);
                            }

                        }
                    }
                }
            }

        } while (levelModel.casePred != 'P' && s != 'p');
        if (s == 'p') {

        }

        if (levelModel.casePred == 'P' && levelModel.compteur != levelModel.getGlaceTab()) {
            view.clearConsole();
            System.out.println("Perdu, vous n'avez pas parcouru l'ensemble de la glace !");
            System.out.println(levelModel.compteur + "/" + levelModel.getGlaceTab());

            System.out.println("Veuillez recommencer la partie");
            Start(num);
        } else {
            if(num==5){
                view.Gagner();
                savecontroller.saveControllerNiveau(num);
                
            }
            else{
            
            char r;

            if (s == 'p') {
                r = view.Stop();
                switch (r) {

                    case 'Q':
                        //savecontroller.saveController(levelModel.compteur, timercontroller.timer.minute, timercontroller.timer.seconde, num);

                        savecontroller.saveControllerNiveau(num - 1);

                        break;

                }
            } else {
                r = view.Jouer(num);
                switch (r) {
                    case 'Y':
                        savecontroller.saveControllerScore(num, levelModel.compteur, timercontroller.timer.minute, timercontroller.timer.seconde);
                        num++;
                        Start(num);
                        break;

                    case 'Q':
                        savecontroller.saveControllerScore(num, levelModel.compteur, timercontroller.timer.minute, timercontroller.timer.seconde);
                        //System.out.println(num);
                        savecontroller.saveControllerNiveau(num);
                        break;

                }
            }
                
            }

        }

    }

}
