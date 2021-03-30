package Sport;

import java.util.ArrayList;

public class ATeam extends baseClass {
    @Override
    public ArrayList<sporter> getSporter() {
        ArrayList<sporter>sporterlist2=new ArrayList<>();
        sporterlist2.add(new sporter("veli",28,6));
        sporterlist2.add(new sporter("ali",29,9));
        sporterlist2.add(new sporter("cengiz",15,5));

        return sporterlist2;
    }
}
