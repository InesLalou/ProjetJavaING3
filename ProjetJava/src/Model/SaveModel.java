package Model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import View.TimerView;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author lyseb
 */
public class SaveModel {

    MapModel mapmodel = new MapModel();
//int nbFichier;

//Timer timer = new Timer();
    public void sauvegarderScore(int num, int compteur, long min, long sec) {

        try {
            File file = new File("Score" + num + ".txt");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Map" + num + "\nScore : " + compteur + "\nTemps : " + min + "min " + sec + "sec");
            fileWriter.write("\n");
            fileWriter.flush();
            fileWriter.close();

        } catch (IOException ex) {
            System.out.println("IOException is caught");
        }
    }

    public void sauvegarderNiveau(int num) {

        try {
            File file = new File("Level.txt");
            FileWriter fileWriter = new FileWriter(file);

            fileWriter.write("Niveau " + "\n" + num);
            fileWriter.write("\n");

            fileWriter.flush();
            fileWriter.close();

        } catch (IOException ex) {
            System.out.println("IOException is caught");
        }
    }

    public ArrayList lectureScore() {
        // String temp[] = new String[];
        ArrayList<String> temp = new ArrayList<String>();
        int num;
        //File file = new File("Score"+num+".txt");
        // do{
        for (num = 1; num <= 5; num++) {
            File file = new File("Score" + num + ".txt");
            // while(file.exists()){
            try {

                FileReader fichier = new FileReader(file);
                BufferedReader buffer = new BufferedReader(fichier);
                if (file.exists() && !file.isDirectory()) {
                    // int i = 0;
                    String ligne;
                    do {
                        ligne = buffer.readLine();
                        if (ligne != null) {
                            temp.add(ligne);
                            // i++;
                        }
                    } while (ligne != null);
                    buffer.close();

                    System.out.println("");
                } else {
                    System.out.println("le fichier n'existe pas");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            //}
        }

        // }while(file.exists());
        return temp;

    }

    public String lectureNiveau() {
        int i;
        String ligne = new String();
        try {
            File fichier = new File("Level.txt");
            FileReader file = new FileReader(fichier);
            BufferedReader buffer = new BufferedReader(file);
            for (i = 1; i < 5; i++) {
                if (i == 2) {
                    ligne = buffer.readLine();
                } else {
                    buffer.readLine();
                }
            }
            if (fichier.length() == 0) {
                ligne = "0";
            }
        } // br.close();
        catch (IOException e) {
            e.printStackTrace();
        }
        return ligne;

    }

}
