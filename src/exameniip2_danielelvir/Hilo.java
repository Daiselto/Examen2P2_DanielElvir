/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exameniip2_danielelvir;

import javax.swing.JProgressBar;

/**
 *
 * @author HP
 */
public class Hilo extends Thread{
    private JProgressBar progress;
    private boolean vive;
    private double duracion;

    public Hilo(JProgressBar progress, boolean vive, double duracion) {
        this.progress = progress;
        this.vive = vive;
        this.duracion = duracion;
    }
    
    public void run(){
        while (vive) {            
            if (progress.getValue()>=100) {
                progress.setValue(0);
                vive=false;
                progress.setMaximum(60);
            }else{
                progress.setValue(progress.getValue()+1);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
