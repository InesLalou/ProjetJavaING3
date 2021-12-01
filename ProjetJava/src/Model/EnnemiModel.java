/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ine28
 */
public class EnnemiModel extends PersonnageModel {
     public int dx;
    
     void EnnemiModel(){
        dx=1;
    }
     void setDx(int dx){
         this.dx=dx;
     }
     int getDx(){
         return dx;
     }
    void bouger(){
        super.setx(super.getx()+dx);
        
    }
}
