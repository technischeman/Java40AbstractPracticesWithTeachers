package Sport;

public class sporter {
    private String name;
    private int age;
    private int workinghours;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWorkinghours() {
        return workinghours;
    }

    public sporter(String name, int age, int workinghours) {
        this.name = name;
        this.age = age;
        this.workinghours = workinghours;
    }
}
