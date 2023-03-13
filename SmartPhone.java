/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface_Example;

/**
 *
 * @author dell
 */
public class SmartPhone extends Phone implements Camera,MusicPlayer {

    @Override
    public void click() {
        System.out.println("Click Method.");
    }

    @Override
    public void record() {
        System.out.println("Record Method.");
    }

    @Override
    public void play() {
        System.out.println("Play Method."); 
    }

    @Override
    public void stop() {
        System.out.println("Stop Method.");
    }
    public static void main(String []args)
    {
       SmartPhone obj=new SmartPhone();
       obj.call();
       obj.sms();
       obj.click();
       obj.record();
       obj.play();
       obj.stop();
    }
    
    
}
