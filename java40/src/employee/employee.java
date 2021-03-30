package employee;

public abstract class employee {
    public static final String UNIVERSITY="university";
    public static final String COLLEGE="colllege";
    public static final String HIGHSCHOOL="highschool";
    public int getSalary(){
        int unipoints=1;
    switch ("getGraduation"){
        case UNIVERSITY:
            unipoints=4;
        case COLLEGE:
            unipoints=3;
        case HIGHSCHOOL:
            unipoints=2;
            break;

    }
    int foreignlanguage=1;
    if(getForeignlanguage()){
        foreignlanguage=3;

    }
    int experience=getExperience();
    int salary=100*unipoints*foreignlanguage*experience;
    return salary;


    }
    public abstract String getGraduation();
    public abstract boolean getForeignlanguage();
    public abstract int getExperience();



}
