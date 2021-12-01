/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import static java.lang.System.currentTimeMillis;

/**
 *
 * @author I555807
 */
public class TimerModel {
 long elapsed;
    long elapsed2;
    public long heure=0, minute=0, seconde=0;
/**
 *
 * @author I555807
 */
 
 private long startTime = 0;
 private long stopTime = 0;
 private boolean running = false;


  public void start() {
    this.startTime = System.currentTimeMillis();
    this.running = true;
  }


  public void stop() {
    this.stopTime = System.currentTimeMillis();
    this.running = false;
  }


  //elaspsed time in milliseconds
  public void getElapsedTime() {
    
    
    if (running) {
      elapsed = (System.currentTimeMillis() - startTime);
    } else {
      elapsed = (stopTime - startTime);
    }
    
    elapsed = elapsed / 1000;
    
    elapsed2 = (int)elapsed / 60;
            
    minute = elapsed2;
    
    if (minute==0) {
    seconde = elapsed - (minute * 60);
    }
    else {
    seconde = elapsed - (minute*60);  
    }
    
  
   
   /* if (minute==0){
    if(elapsed>=60){
    minute++;
    seconde = elapsed - (60);
    }
    else {
    seconde = elapsed;    
    }
    }
    else {
    if(elapsed>(minute*60)){
    minute++;
    seconde = elapsed - (minute*60);
    elapsed = elapsed - (minute*60);
    }
    else {
    seconde = elapsed;    
    }
    }*/
 /*   else if (minute>0){
    if(elapsed>minute*60){
    seconde = elapsed - (minute*60);
    minute++;
    }
    else {
    seconde = elapsed;    
    }
    }
    */
    
        
  }


  //elaspsed time in seconds
  public long getElapsedTimeSecs() {
    long elapsed;
    if (running) {
      elapsed = ((System.currentTimeMillis() - startTime) / 1000);
    } else {
      elapsed = ((stopTime - startTime) / 1000);
    }
    return elapsed;
  }
	}

  

