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
public class PersonnageModel {
    
    String nom;
    int xPersonnage, yPersonnage;
    
    PersonnageModel(){
        
    }
    public String getNom(){
        return nom;
    }
    public int getx(){
        return xPersonnage;
    }
    public int gety(){
        return yPersonnage;
    }
    public void setNom(String nom){
       this.nom = nom; 
    }
    public void setx(int xPos){
         xPersonnage = xPos;
    }
    public void sety(int yPos){
         yPersonnage = yPos;
    }
    
    
}
