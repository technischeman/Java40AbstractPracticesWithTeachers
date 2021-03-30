package Sport;

public class mainClass {
    public static void main(String[] args) {
        ATeam aTeam = new ATeam();
    double average=    aTeam.getAverageWorking();
        System.out.println("ateam average working hours "+ average);
        BTeam bTeam=new BTeam();
        double average2=bTeam.getAverageWorking();
        System.out.println("bteam average working hours "+ average2);

    }
}
