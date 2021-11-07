/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetjava;

/**
 *
 * @author I555807
 */
public class Personnage {
    String nom;
    int xPersonnage, yPersonnage;
    
    Personnage(){
        
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
    
