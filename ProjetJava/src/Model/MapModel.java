/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author lyseb
 */
public class MapModel{
    public int  compteur;
    int glaceTab;
    
    public EnnemiModel ennemi= new EnnemiModel();
    char[][] map = new char[15][19];
    public char casePred;
    public char casePredEnnemi;
    public PersonnageModel eceman = new PersonnageModel();
    public boolean ennemiBool;
    public boolean collision;
    
    
     public char[][] getMap(){
         return map;
     }
     
     public void Tab(int levelNum) {
         ennemiBool=false;
        if(levelNum==1)
           DefTab1();
           //num = 1;
        if(levelNum==2)
            DefTab2();
        if(levelNum==3)
            DefTab3();
        if(levelNum==4) 
            DefTab4();
        if(levelNum==5) 
            DefTab5();
           // num = 2;
        
        collision=false;
        casePred = 'g';
        
    }
      
     public int getGlaceTab(){
         return glaceTab;
     }
     public EnnemiModel getEnnemi(){
         return ennemi;
     }
     public boolean getCollision(){
         return collision;
     }
   
    public void DefTab1() {
        
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
        glaceTab=12;
        //num = 1;
        

    }
    public void DefTab2() {
        
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
        glaceTab=36;
        
    }

    public void DefTab3(){
        
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
        glaceTab=38;
        eceman.setx(7);
        eceman.sety(13);
        //glaceTab=;
        
    }
    
    
    public void DefTab4(){
        
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
        glaceTab=40;
        eceman.setx(12);
        eceman.sety(16);
        
    }
    
    public void DefTab5(){
        
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 19; j++) {
                map[i][j] = '#';
            }
        }
        for (int i = 2; i < 11; i++) {
            for (int j = 3; j < 16; j++) {
                map[i][j] = 'M';
            }
        }
        for (int i = 3; i < 10 ; i++) {
            for (int j = 5; j < 7; j++) {
                map[i][j] = 'g';
            }
        }
        for (int j= 7; j < 12 ; j++) {
                map[3][j] = 'g';
        }
     for (int i =3; i < 9 ; i++) {
                map[i][11] = 'g';
        }
        for (int i = 7; i <9 ; i++) {
            for (int j = 12; j < 15 ; j++) {
                map[i][j] = 'g';
            }
        }
       
        map[7][4]='P';
        map[6][14]='E';
        map[3][5]='e';
        ennemi.setDx(+1);
        ennemiBool=true;
        eceman.setx(6);
        eceman.sety(14);
        
        glaceTab=31;
        ennemi.setx(3);
        ennemi.sety(5);
        casePredEnnemi = 'g';
       
    }
    
    
    public void haut(){
        
        
            if (map[eceman.getx() - 1][eceman.gety()] == 'g' || map[eceman.getx() - 1][eceman.gety()] == 'P' || map[eceman.getx() - 1][eceman.gety()] == 'G' || map[eceman.getx() - 1][eceman.gety()] == 'T' || map[eceman.getx() - 1][eceman.gety()] == 'e') {
                
                if (casePred == 'g') {
                    map[eceman.getx()][eceman.gety()] = 'o';
                    compteur++;
                }
                if (casePred == 'G') {
                    map[eceman.getx()][eceman.gety()] = 'g';
                }
                if (casePred == 'T') {
                    map[eceman.getx()][eceman.gety()] = 'o';
                    compteur++;
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
                
                           
            } 
    }
    public void bas(){
        
        if (map[eceman.getx() + 1][eceman.gety()] == 'g' || map[eceman.getx() + 1][eceman.gety()] == 'P' || map[eceman.getx() + 1][eceman.gety()] == 'G' || map[eceman.getx() + 1][eceman.gety()] == 'T' || map[eceman.getx() + 1][eceman.gety()] == 'e') {
                
                if (casePred == 'g') {
                    map[eceman.getx()][eceman.gety()] = 'o';
                    compteur++;
                }
                if (casePred == 'G') {
                    map[eceman.getx()][eceman.gety()] = 'g';
                }
                if (casePred == 'T') {
                    map[eceman.getx()][eceman.gety()] = 'o';
                    compteur++;
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
                
    }
    }
    
    public void droite(){
        if (map[eceman.getx()][eceman.gety() + 1] == 'g' || map[eceman.getx()][eceman.gety() + 1] == 'P' || map[eceman.getx()][eceman.gety() + 1] == 'G' || map[eceman.getx()][eceman.gety() + 1] == 'T' || map[eceman.getx()][eceman.gety() + 1] == 'e') {
                if (casePred == 'g') {
                    map[eceman.getx()][eceman.gety()] = 'o';
                    compteur++;
                }
                if (casePred == 'G') {
                    map[eceman.getx()][eceman.gety()] = 'g';
                }
                if (casePred == 'T') {
                    map[eceman.getx()][eceman.gety()] = 'o';
                    compteur++;
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
                
    }
}
    public void gauche() {
       // System.out.println("test");
        //System.out.println(eceman.getx() +"et"+ eceman.gety());
          
        if (map[eceman.getx()][eceman.gety() - 1] == 'g' || map[eceman.getx()][eceman.gety() - 1] == 'P' || map[eceman.getx()][eceman.gety() - 1] == 'G' || map[eceman.getx()][eceman.gety() - 1] == 'T' || map[eceman.getx()][eceman.gety() - 1] == 'R' || map[eceman.getx()][eceman.gety() - 1] == 'e') {//Verifie si la case suivante est une glace
            //System.out.println("test2");
            if (casePred == 'g')//Transforme la glace en eau
            {
                map[eceman.getx()][eceman.gety()] = 'o';
                compteur++;
            }
            if (casePred == 'G') {
                map[eceman.getx()][eceman.gety()] = 'g';
            }
            if (casePred == 'T') {
                map[eceman.getx()][eceman.gety()] = 'o';
                compteur++;
            }
            //Utiliser un objet
            int i = 1;
            int y;
            casePred = map[eceman.getx()][eceman.gety() - 1];
            if (map[eceman.getx()][eceman.gety() - 1] == 'T') {
                do {
                    y = eceman.gety() - i;
                    map[eceman.getx()][y] = 'o';
                    i++;
                } while (map[eceman.getx()][eceman.gety() - i] != 'M');
            }

            //Si Portail
            if (map[eceman.getx()][eceman.gety() - 1] == 'R') {
                //System.out.println("test R2");
                casePred = map[2][4];
                //Deplacer Eceman
                map[2][4] = 'E';//Deplace perso
                //Memoriser sa position
                eceman.setx(2);
                eceman.sety(4);
            } else {
                //Deplacer Eceman
                map[eceman.getx()][eceman.gety() - 1] = 'E';//Deplace perso 
                //Memoriser sa position
                eceman.sety(eceman.gety() - 1);
            }
        }
    }
    public void deplacementEnnemi(){
        //map[ennemi.getx()][ennemi.gety()] = 'g';
            if(casePredEnnemi=='g'){
                    map[ennemi.getx()][ennemi.gety()] = 'g';
                }
                if(casePredEnnemi=='o'){
                    map[ennemi.getx()][ennemi.gety()] = 'o';
                }
                
                if(map[ennemi.getx()+1][ennemi.gety()]=='M'){
                    ennemi.setDx(-1);
                }
            //Verifier si devant un mur/obstacle
                if(map[ennemi.getx()-1][ennemi.gety()]=='M'){
                    ennemi.setDx(+1);
                    
                }
            //Vérifir si coince
                if(map[ennemi.getx()-1][ennemi.gety()]=='M'){
                    if(map[ennemi.getx()+1][ennemi.gety()]=='M'){
                    ennemi.setDx(0);
                    
                }
                }
                if(ennemi.getDx()==1){
                    casePredEnnemi=map[ennemi.getx()+1][ennemi.gety()];
                }
                if(ennemi.getDx()==-1){
                    casePredEnnemi=map[ennemi.getx()-1][ennemi.gety()];
                }
                
                ennemi.bouger();
                
                map[ennemi.getx()][ennemi.gety()] = 'e';
              
    }
    
    public void Collision(){
        if(ennemi.getx()==eceman.getx() && ennemi.gety()==eceman.gety()){
            collision=true;
        }
    }
    
}
