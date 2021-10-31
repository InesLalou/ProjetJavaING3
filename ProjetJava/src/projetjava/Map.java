/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetjava;

/**
 *
 * @author I555807
 */
  
public class Map {

    char[][] map = new char[15][19];
    Personnage eceman = new Personnage();
    Personnage ennemi = new Personnage();
    boolean obj;
    char casePred;

    Map() {
        DefTab1();
        casePred = 'g';
    }

    void DefTab1() {
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 19; j++) {
                map[i][j] = '#';
            }
        }
        for (int i = 10; i < 13; i++) {
            for (int j = 1; j < 16; j++) {
                map[i][j] = 'M';
            }
        }
        int i = 11;
        for (int j = 2; j < 14; j++) {
            map[11][j] = 'g';
        }
        map[11][2] = 'P';
        map[11][14] = 'E';
        eceman.setx(11);
        eceman.sety(14);

    }

    void Deplacer(char d) {
        if (d == 'z') {
            if (map[eceman.getx() - 1][eceman.gety()] == 'g' || map[eceman.getx()][eceman.gety() - 1] == 'P') {
                if (casePred == 'g') {
                    map[eceman.getx()][eceman.gety()] = 'o';
                }

                casePred = map[eceman.getx() - 1][eceman.gety()];
                map[eceman.getx() + 1][eceman.gety()] = 'E';
                eceman.setx(eceman.getx()-1);
                
            } 

        }
        
        else if (d == 's') {
            if (map[eceman.getx() + 1][eceman.gety()] == 'g' || map[eceman.getx()][eceman.gety() - 1] == 'P') {
                if (casePred == 'g') {
                    map[eceman.getx()][eceman.gety()] = 'o';
                }

                casePred = map[eceman.getx() + 1][eceman.gety()];
                map[eceman.getx() + 1][eceman.gety()] = 'E';
                
                eceman.setx(eceman.getx()+1);
            } 

        } else if (d == 'd') {//Droite
            if (map[eceman.getx()][eceman.gety() + 1] == 'g' || map[eceman.getx()][eceman.gety() - 1] == 'P') {
                if (casePred == 'g') {
                    map[eceman.getx()][eceman.gety()] = 'o';
                }
                
                casePred = map[eceman.getx()][eceman.gety() + 1];
                map[eceman.getx()][eceman.gety() + 1] = 'E';
                
                eceman.sety(eceman.gety() + 1);
            } 

        } 
        else if (d == 'q') {//Gauche
            if (map[eceman.getx()][eceman.gety() - 1] == 'g' || map[eceman.getx()][eceman.gety() - 1] == 'P') {//Verifie si la case suivante est une glace
                if (casePred == 'g')//Transforme la glace en eau
                {
                    map[eceman.getx()][eceman.gety()] = 'o';
                    
                }

                casePred = map[eceman.getx()][eceman.gety() - 1];
                map[eceman.getx()][eceman.gety() - 1] = 'E';//Deplace perso 
                
                eceman.sety(eceman.gety() - 1);
                
            } 

        }
        else {
                //Ne peut pas se deplacer
            }
    }

    void Afficher() {
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println("");
        }
    }

}

