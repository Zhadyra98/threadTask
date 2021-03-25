package action;

import model.AutoStop;
import model.ThreadAuto;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        AutoStop autoStop1= new AutoStop(5);
        AutoStop autoStop2= new AutoStop(7);
        AutoStop autoStop3= new AutoStop(6);
        List<AutoStop> list = new ArrayList<AutoStop>();
        list.add(autoStop1);
        list.add(autoStop2);
        list.add(autoStop3);

        ThreadAuto t1 = new ThreadAuto(8,list);
        ThreadAuto t2=  new ThreadAuto(7,list);
        ThreadAuto t3=  new ThreadAuto(6,list);
        t1.start();
        t2.start();
        t3.start();
    }
}
