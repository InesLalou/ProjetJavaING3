/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetjava;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author I555807
 */
public class Timer {
    void AfficherTimer() throws InterruptedException {
        boolean x=true;
    long displayMinutes=0;
    long starttime=System.currentTimeMillis();
    
    while(x)
    {
        TimeUnit.SECONDS.sleep(1);
        long timepassed=System.currentTimeMillis()-starttime;
        long secondspassed=timepassed/1000;
        if(secondspassed==60)
        {
            secondspassed=0;
            starttime=System.currentTimeMillis();
        }
        if((secondspassed%60)==0)
        displayMinutes++;
Map map = new Map();


    }
    }
}
