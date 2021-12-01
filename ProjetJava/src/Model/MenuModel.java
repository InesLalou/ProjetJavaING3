/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.MapController;
import Controller.SaveController;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author ine28
 */
public class MenuModel {

    MapModel model = new MapModel();
    MapController controller = new MapController();
    SaveController savecontroller = new SaveController();

    public MenuModel() {

    }

    /* public void NouvellePartie(){
        System.out.println("test");
        Tab(1);
        model.Afficher();
        controller.Start(model,1);
        
    }*/
    public int ContinuePartie() {
        //System.out.println(savecontroller.lectureControllerNiveau());
        // System.out.println(savecontroller.lectureControllerNiveau());
        int level = Integer.parseInt(savecontroller.lectureControllerNiveau());
        return level;

    }

    public void renitialiseScore() {
        int num;
        for (num = 1; num <= 5; num++) {
//File file = new File("Score"+num+".txt");
// while(file.exists()){
            try {
                PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("Score" + num + ".txt", false)));
                pw.println("");
// if(file.exists()&&!file.isDirectory()){
// int i = 0;
/*String ligne;
do
{
ligne = buffer.readLine();
if (ligne != null)
{
temp.add(ligne);
// i++;
}
}while (ligne != null );
buffer.close();
//System.out.println("");
}
else{
System.out.println("le fichier n'existe pas");
}*/
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
