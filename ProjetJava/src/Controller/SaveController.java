package Controller;
import Model.SaveModel;
import Model.MapModel;
import View.SaveView;
import java.util.ArrayList;
/**
*
* @author lyseb
*/
public class SaveController {
SaveModel save = new SaveModel();
MapModel levelModel = new MapModel();
SaveView save_view = new SaveView();

public void saveControllerScore(int num,int compteur, long min, long sec){
    save.sauvegarderScore(num,compteur, min, sec);
    save_view.saveView();
}

public void saveControllerNiveau(int num){
    save.sauvegarderNiveau(num);
   // save_view.saveView();
}

public void lectureControllerScore(){
    ArrayList<String> score = save.lectureScore();
    save_view.Score(score);
}

public String lectureControllerNiveau(){
    String level = save.lectureNiveau();
    //save_view.Level(level);
    
    return level;
}


}