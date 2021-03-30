package employee;

public class manager extends employee {
    @Override
    public String getGraduation() {
        return UNIVERSITY;
    }

    @Override
    public boolean getForeignlanguage() {
        return true;
    }

    @Override
    public int getExperience() {
        return 10;
    }
}
