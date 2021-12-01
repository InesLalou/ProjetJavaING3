/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author I555807
 */
import static java.lang.System.currentTimeMillis;
import Model.TimerModel;
import View.TimerView;
/**
 *
 * @author I555807
 */
public class TimerController {
    
public TimerModel timer = new TimerModel();
 TimerView timerview = new TimerView();
 public void timerstart(){
  timer.start();
 }   
 public void timeraffichage(){
  timer.getElapsedTime();
  timerview.getElapsedTimeAffichage(timer.minute, timer.seconde);
 }
 public long getTimeElapsedSecs(){
     return timer.getElapsedTimeSecs();
 }
 
 
}

