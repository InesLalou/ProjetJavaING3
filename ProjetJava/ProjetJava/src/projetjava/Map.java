/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetjava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
//import java.io.FileNotFoundException;



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
    int num;
    static int compteur;
    static long displayminutes;
    static long displaysecondes;
            boolean x=true;
    static long displayMinutes=0;
    long starttime=System.currentTimeMillis();
    static int niveau = 1;
    
    void Map(){
        
    }
    void Tab(int tab) {
        if(tab==1)
           DefTab1();
           //num = 1;
        if(tab==2)
            DefTab2();
        if(tab==3)
            DefTab3();
        if(tab==4)
            DefTab4();
           // num = 2;

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
        //num = 1;

    }
    void DefTab2() {
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 19; j++) {
                map[i][j] = '#';
            }
        }
        for (int i = 3; i < 12; i++) {
            for (int j = 4; j < 14; j++) {
                map[i][j] = 'M';
            }
        }
        map[5][9] = 'g';
        for (int j = 5; j < 10; j++) {
            map[4][j] = 'g';
        }
        for (int i = 4; i < 11; i++) {
            map[i][5] = 'g';
        }
        for (int i = 9; i < 11; i++) {
            for (int j = 5; j < 13; j++) {
                map[i][j] = 'g';
            }
        }
        for (int i = 6; i < 11; i++) {
            for (int j = 11; j < 13; j++) {
                map[i][j] = 'g';
            }
        }
        map[6][10] = 'g';
        map[6][9] = 'G';
        map[6][8] = 'g';
        map[6][7] = 'P';
        map[7][9] = 'E';
        eceman.setx(7);
        eceman.sety(9);
        
    }

    void DefTab3(){
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 19; j++) {
                map[i][j] = '#';
            }
        }
        for (int i = 1; i < 12; i++) {
            for (int j = 3; j < 15; j++) {
                map[i][j] = 'M';
            }
        }
        for (int j = 5; j < 8; j++) {
           map[2][j] = 'g';
        }
        for (int j = 11; j < 14; j++) {
           map[2][j] = 'g';
        }
        for (int j = 5; j < 14; j++) {
           map[4][j] = 'g';
        }
        
        for (int j = 4; j < 13; j++) {
           map[10][j] = 'g';
        }
        for (int j = 11; j < 14; j++) {
           map[8][j] = 'g';
        }
        map[3][5]='g';
        map[3][7]='g';
        map[3][13]='g';
        for (int i = 2; i < 10; i++) {
                map[i][7] = 'g';
        }
        for (int i = 2; i < 8; i++) {
                map[i][11] = 'g';
        }
        
        map[4][7]='G';
        map[4][11]='G';
        map[10][7]='G';
        map[10][6]='T';
        map[10][13]='P';
        map[7][13]='E';
        
        eceman.setx(7);
        eceman.sety(13);
        
    }
    
    
    void DefTab4(){
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 19; j++) {
                map[i][j] = '#';
            }
        }
        for (int i = 1; i < 14; i++) {
            for (int j = 2; j < 19; j++) {
                map[i][j] = 'M';
            }
        }
        
        
       for (int j = 4; j < 10; j++) {
            map[2][j] = 'g';
        }
        for (int j = 15; j < 18; j++) {
            map[2][j] = 'g';
        }
        for (int j = 13; j < 16; j++) {
            map[3][j] = 'g';
        }
        for (int j = 9; j < 14; j++) {
            map[4][j] = 'g';
        }
        map[3][9] = 'g';
        
        for (int j = 4; j < 16; j++) {
            map[12][j] = 'g';
        }
        for (int j = 10; j < 13; j++) {
            map[7][j] = 'g';
        }
        map[8][10] = 'g';
        map[9][10] = 'g';
        map[8][12] = 'g';
        map[9][12] = 'g';
        for (int i = 9; i < 13; i++) {
            map[i][11] = 'G';
        }
        
        map[2][17]='P';
        map[12][16]='E';
        map[2][3]='R';
        map[12][3]='R';
        
        eceman.setx(12);
        eceman.sety(16);
        
    }
    
    //methodes pour récupérer temps
    static void temps(long minutes, long secondes){
      displayminutes = minutes;
      displaysecondes = secondes;
        
        
    }
    
    void Deplacer(char d) {
        if (d == 'z') {// Partie perdue si rentre dans eau ou mur ??
            //System.out.println("test1");
            if (map[eceman.getx() - 1][eceman.gety()] == 'g' || map[eceman.getx() - 1][eceman.gety()] == 'P' || map[eceman.getx() - 1][eceman.gety()] == 'G' || map[eceman.getx() - 1][eceman.gety()] == 'T') {
                System.out.println("test2");
                if (casePred == 'g') {
                    map[eceman.getx()][eceman.gety()] = 'o';
                }
                if (casePred == 'G') {
                    map[eceman.getx()][eceman.gety()] = 'g';
                }
                if (casePred == 'T') {
                    map[eceman.getx()][eceman.gety()] = 'o';
                }

                casePred = map[eceman.getx() - 1][eceman.gety()];
                int i=1;
                int x;
                //Utiliser l'objet
                if(map[eceman.getx() - 1][eceman.gety()] == 'T')
                {
                    do{
                    x=eceman.getx()-i;
                    map[x][eceman.gety()] ='o';
                    i++;
                    }while(map[eceman.getx()-i][eceman.gety()] != 'M');
                }
                
                //Deplacer Eceman
                map[eceman.getx() - 1][eceman.gety()] = 'E';
                //Memoriser sa position
                eceman.setx(eceman.getx()-1);
                //compteur et affichage de glaces brisées 
                compteur = compteur +1;
                     
                
                
                
                
            } 
        }  
        else if (d == 's') {
            if (map[eceman.getx() + 1][eceman.gety()] == 'g' || map[eceman.getx() + 1][eceman.gety()] == 'P' || map[eceman.getx() + 1][eceman.gety()] == 'G' || map[eceman.getx() + 1][eceman.gety()] == 'T') {
                
                if (casePred == 'g') {
                    map[eceman.getx()][eceman.gety()] = 'o';
                }
                if (casePred == 'G') {
                    map[eceman.getx()][eceman.gety()] = 'g';
                }
                if (casePred == 'T') {
                    map[eceman.getx()][eceman.gety()] = 'o';
                }
                
                casePred = map[eceman.getx() + 1][eceman.gety()];
                int i=1;
                int x;
                //Utiliser l'objet
                if(map[eceman.getx() + 1][eceman.gety()] == 'T')
                {
                    do{
                    x=eceman.getx()+i;
                    map[x][eceman.gety()] ='o';
                    i++;
                    }while(map[eceman.getx()+i][eceman.gety()] != 'M');
                }
                
                //Deplacer Eceman
                map[eceman.getx() + 1][eceman.gety()] = 'E';
                //Memoriser sa position
                eceman.setx(eceman.getx()+1);
                //compteur et affichage de glaces brisées 
                compteur = compteur +1;
                
            } 

        } else if (d == 'd') {//Droite
            if (map[eceman.getx()][eceman.gety() + 1] == 'g' || map[eceman.getx()][eceman.gety() + 1] == 'P' || map[eceman.getx()][eceman.gety() + 1] == 'G' || map[eceman.getx()][eceman.gety() + 1] == 'T') {
                if (casePred == 'g') {
                    map[eceman.getx()][eceman.gety()] = 'o';
                }
                if (casePred == 'G') {
                    map[eceman.getx()][eceman.gety()] = 'g';
                }
                if (casePred == 'T') {
                    map[eceman.getx()][eceman.gety()] = 'o';
                }
                int i=1;
                int y;
                //Utiliser l'objet
                casePred = map[eceman.getx()][eceman.gety() + 1];
                if(map[eceman.getx()][eceman.gety() + 1] == 'T')
                {
                    do{
                    y=eceman.gety()+i;
                    map[eceman.getx()][y] ='o';
                    i++;
                    }while(map[eceman.getx()][eceman.gety()+i] != 'M');
                }
                //Deplacer Eceman
                map[eceman.getx()][eceman.gety() + 1] = 'E';
                //Memoriser sa position
                eceman.sety(eceman.gety() + 1);
                //compteur et affichage de glaces brisées 
                compteur = compteur +1;
                
            } 

        } 
        else if (d == 'q') {//Gauche
            
            if (map[eceman.getx()][eceman.gety() - 1] == 'g' || map[eceman.getx()][eceman.gety() - 1] == 'P' || map[eceman.getx()][eceman.gety() - 1] == 'G' || map[eceman.getx()][eceman.gety() - 1] == 'T' || map[eceman.getx()][eceman.gety() - 1] == 'R') {//Verifie si la case suivante est une glace
               
                if (casePred == 'g')//Transforme la glace en eau
                {
                    map[eceman.getx()][eceman.gety()] = 'o';
                }
                if (casePred == 'G') {
                    map[eceman.getx()][eceman.gety()] = 'g';
                }
                if (casePred == 'T') {
                    map[eceman.getx()][eceman.gety()] = 'o';
                }
                //Utiliser un objet
                int i=1;
                int y;
                casePred = map[eceman.getx()][eceman.gety() - 1];
                if(map[eceman.getx()][eceman.gety()-1] == 'T')
                {
                    do{
                    y=eceman.gety()-i;
                    map[eceman.getx()][y] ='o';
                    i++;
                    }while(map[eceman.getx()][eceman.gety()-i] != 'M');
                }
                
               
                //Si Portail
                if(map[eceman.getx()][eceman.gety()-1] == 'R')
                {
                    System.out.println("test R2");
                    casePred = map[2][4];
                    //Deplacer Eceman
                    map[2][4] = 'E';//Deplace perso
                    //Memoriser sa position
                    eceman.setx(2);
                    eceman.sety(4);
                }
                else{
                     //Deplacer Eceman
                    map[eceman.getx()][eceman.gety() - 1] = 'E';//Deplace perso 
                    //Memoriser sa position
                    eceman.sety(eceman.gety() - 1);
                    //compteur et affichage de glaces brisées 
                compteur = compteur +1;
                
                
                }
                
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
    
    void Partie(Map mapActuel, int num) throws InterruptedException{
         Scanner char1 = new Scanner(System.in);
                char s;
                do { //System.out.print("\033[H\033[2J"); 
                    //System.out.flush();
                    
                    
        TimeUnit.SECONDS.sleep(1);
        long timepassed=System.currentTimeMillis()-starttime;
        long secondspassed=timepassed/1000;
        if(secondspassed==60)
        {
            secondspassed=0;
            starttime=System.currentTimeMillis();
        }
        if((secondspassed%60)==0)
        displayMinutes++;
                   
                    s = char1.next().charAt(0);
                    clearConsole();
                    mapActuel.Deplacer(s);
                    System.out.println("Niveau : "+niveau); 
                    System.out.println("Score : "+compteur);
                    System.out.println("Temps : "+displayMinutes+"min "+secondspassed+"s");
                    mapActuel.Afficher();
                    displaysecondes = secondspassed;
                    
                } while (mapActuel.casePred != 'P' && s !='p' && x );

                
                if (mapActuel.casePred == 'P') {
                    System.out.println("Fin du Tableau "+num+" : Félicitation ! vous aurez des bonbons");
                    niveau = niveau+1;
                }
                
                System.out.println("Voulez-vous continuer ? Tapez Y");
                System.out.println("Voulez-vous quitter et sauvegarder votre partie ? Tapez Q");
                s = char1.next().charAt(0);
                
                if(s=='Y' && num+1<6){

               clearConsole();
                num++;
                Map mapPro = new Map();
                mapPro.Tab(num);
                compteur = 0;
                displayminutes = 0;
                displaysecondes=0;
                System.out.println("Niveau : "+niveau); 
                System.out.println("Score : "+compteur);
                System.out.println("Temps : "+displayMinutes+"min "+displaysecondes+"s");
                mapPro.Afficher();
                mapPro.Partie(mapPro, num);
                
                }
                else{
                  System.out.println("Votre partie a été sauvegardée. A bientôt !");
                  // sauvegarder();
                }
                
    }
    /*void sauvegarder() {
        try{
        File file = new File("C:\\Users\\lyseb\\Documents\\GitHub\\ProjetJavaING3\\ProjetJava\\ file.txt");
        FileWriter fileWriter = new FileWriter(file);
        
        for (int i=0; i<15;i++){
           for(int j=0; j<19; j++){
               fileWriter.write(""+map[i][j]);
               
           }
           fileWriter.write("\n");
           
    }
         fileWriter.flush();
               fileWriter.close();


        }catch (IOException ex) {
                    System.out.println("IOException is caught");
                }
    }*/
    /*char[][] reprise(){
        char tab[][] = new char[15][19];
        try{
         BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\lyseb\\Documents\\GitHub\\ProjetJavaING3\\ProjetJava\\ file.txt"));
        String temp[] = new String[15];
        
        int i = 0;
        String ligne;
 
        //String nomMap = br.readLine();
        //int nombreLignes = Integer.parseInt(br.readLine());
       // int nombreColonnes = Integer.parseInt(br.readLine());
 
 
        do
        {
            ligne = br.readLine();
            if (ligne != null) 
            {
                temp[i] = ligne;
                i++;
            }
        }
        while (ligne != null);
        br.close();
 
        for (int j = 0 ; j < 15 ; j++)
        {
            for (int h = 0 ; h < 19 ; h++)
            {
                tab[j][h] = temp[j].charAt(h);
                if(tab[j][h]=='E'){
                    casePred='g';
                    eceman.setx(j);
                    eceman.sety(h);
                    //tab[j][h]='o';
                }
            }
        }
 
        //System.out.println("Nom de la map : " + nomMap);
       // System.out.println("Taile de la map : " + nombreLignes + "x" + nombreColonnes);
        /*System.out.println("Detail de la map : \n");
 
        for (int j = 0 ; j < 15 ; j++)
        {
            for (int h = 0 ; h < 19 ; h++)
            {
                System.out.print(tab[j][h]);
            }
            System.out.println("");
        }
 
        } catch(IOException e)
        {
            e.printStackTrace();
        }
        return tab;
    }*/
    
   public final static void clearConsole()
{
    try {
  if(System.getProperty("os.name" ).startsWith("Windows" ))
    Runtime.getRuntime().exec("cls" );
  else
    Runtime.getRuntime().exec("clear" );
} catch(Exception excpt) {
  for(int i=0;i<100;i++)
    System.out.println();
}
   
}  
}

