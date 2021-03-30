package Sport;

import java.util.ArrayList;

public abstract class  baseClass {
    public abstract ArrayList<sporter>getSporter();
    public  double getAverageWorking(){
        ArrayList<sporter>sporterlist=getSporter();
        double sumWorkingHours=0;
        for (sporter sporter:sporterlist
             ) {sumWorkingHours+=sporter.getWorkinghours();

        }
        double average=sumWorkingHours/sporterlist.size();
        return average;

    }

}
