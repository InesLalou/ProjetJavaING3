/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import View.TimerView;
import Model.MenuModel;
import View.MenuView;
import Controller.MenuController;

/**
 *
 * @author ine28
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InterruptedException {
        
        
        MenuModel model=new MenuModel();
        MenuView view=new MenuView();
        MenuController controleur= new MenuController();
        controleur.AfficherMenu();
        int choix;
        do{
            choix = controleur.AfficherMenu();
        
        }while(choix!=3);
        
    }
}
