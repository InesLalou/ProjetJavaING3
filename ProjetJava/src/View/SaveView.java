package View;

import java.util.ArrayList;

/**
 *
 * @author lyseb
 */
public class SaveView {

    public void saveView() {
        System.out.println("Votre partie a été sauvegardée. A bientôt !");
    }
    public void Score(ArrayList<String> tab){
        for(int i=0; i<tab.size(); i++){
            System.out.println(tab.get(i));
        }
    }
    
    /*public void Level(String niv){
        
            System.out.println(niv);
        
    }*/
}
