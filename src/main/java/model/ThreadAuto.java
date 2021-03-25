package model;

import model.AutoStop;

import java.util.ArrayList;
import java.util.List;


public class ThreadAuto extends Thread{
    private int numberOfCarsCame;
    List <AutoStop> list;
    public ThreadAuto (int numberOfCarsCame,List <AutoStop> list){
        this.numberOfCarsCame=numberOfCarsCame;
        this.list=list;
    }
    @Override
    public void run(){
        for(int i=0; i<numberOfCarsCame; i++){
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            placeToAutoStop();
        }
    }
    public void placeToAutoStop(){
        boolean isPlacedCar=false;
        synchronized (list){
            for(AutoStop autoStop : list){
                if(autoStop.getNumberOfPlaces()>autoStop.getCurrentNumberOfCars()){
                    autoStop.setCurrentNumberOfCars(autoStop.getCurrentNumberOfCars()+1);
                    isPlacedCar=true;
                    break;
                }
            }
            if (isPlacedCar){
                System.out.println("Car is placed successfully "+Thread.currentThread().getName());
                System.out.println(list.toString());
            }
            else {
                System.out.println("Not enough place ,all "+list.size()+" auto stops are full !!!");
            }
        }

    }

}
