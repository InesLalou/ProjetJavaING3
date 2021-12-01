/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.MenuModel;
import View.MapView;
import View.MenuView;
import Model.MapModel;
import View.TimerView;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Thread.sleep;

/**
 *
 * @author ine28
 */
public class MenuController {

    MenuModel model = new MenuModel();
    MenuView view = new MenuView();
    MapView vue = new MapView();
//MapController controller = new MapController();
    MapModel map = new MapModel();
    SaveController saveController = new SaveController();
    MapController controller = new MapController();
    public int selection;

    public MenuController() {

    }

    public MenuController(MenuModel model, MenuView view) {
        this.model = model;
        this.view = view;
    }

    void setModel(MenuModel model) {
        this.model = model;
    }

    void setView(MenuView view) {
        this.view = view;
    }

    MenuModel getModel() {
        return model;
    }

    MenuView getView() {
        return view;
    }

    public int AfficherMenu() throws InterruptedException {
        int selec = 0;
        selec = view.ChoixGraphiqueOuConsole();

        switch (selec) {
            case 1:
                int choix;
                do {
                    choix = AfficherMenuConsole();
                } while (choix != 5);
// LireChoixConsole(selection);
                break;
            case 2:
                view.AfficherMenuGraphique();
//LireChoixGraphique(selection);
                break;
            case 3:
                view.QuitterPartie();
                model.renitialiseScore();
                break;

        }
        return selec;
    }

    public int AfficherMenuConsole() throws InterruptedException {
        int selec = 0;
        selec = view.Menu();
        switch (selec) {
            case 1:
                NouvellePartie();
                break;
            case 2:
                ContinuerPartie();
                break;
            case 3:
                saveController.lectureControllerScore();
                sleep(5000);
                break;
            case 4:
                view.Regles();

                break;
            case 5:
                view.QuitterPartie();
                break;
        }
        return selec;
    }

    public void LireChoixGraphique(int selection) {
        switch (selection) {

        }
    }

    /*public void LireChoixConsole(int selection) throws InterruptedException {
switch(selection){
case 1 :
NouvellePartie();
break;
case 2 :
ContinuerPartie();
break;
case 3 :
saveController.lectureControllerScore();
sleep(5000);
break;
case 4 :
view.Regles();
break;
case 5 :
view.QuitterPartie();
break;
}
}*/
    public void LireChoixGraphique() {
    }

    public void NouvellePartie() {
// System.out.println("test");
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("Level.txt", false)));
            pw.println("");
            controller.Start(5);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ContinuerPartie() {
        if (model.ContinuePartie() == 5) {
            controller.Start(1);
        } else {
            controller.Start(model.ContinuePartie() + 1);
        }
    }
}
