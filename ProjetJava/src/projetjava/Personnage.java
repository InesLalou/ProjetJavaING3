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
    int xPersonnage2, yPersonnage2;
    
    public String getNom(){
        return nom;
    }
    public int getxPerso(){
        return xPersonnage;
    }
    public int getyPerso(){
        return yPersonnage;
    }
    public String setNom(String nom){
       return this.nom = nom; 
    }
    public int setxPerso(int xPos){
        return xPersonnage = xPos;
    }
    public int setyPerso(int yPos){
        return yPersonnage = yPos;
    }
    
    public void collison(){
        if(xPersonnage == xPersonnage2 && yPersonnage == yPersonnage2 ){
            System.out.println(" Game Over");
            
        }
    }
}
    
