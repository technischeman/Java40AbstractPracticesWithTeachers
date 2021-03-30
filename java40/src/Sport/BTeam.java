package Sport;

import java.util.ArrayList;

public class BTeam extends baseClass {
    @Override
    public ArrayList<sporter> getSporter() {
        ArrayList<sporter> sporterlist=new ArrayList<>();
        sporterlist.add(new sporter("arif",28,6));
        sporterlist.add(new sporter("ali",25,3));
        sporterlist.add(new sporter("adem",15,5));

        return sporterlist;
    }
}
