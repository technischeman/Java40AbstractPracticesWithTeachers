package employee;

public class mainClass {
    public static void main(String[] args) {
        manager manager1=new manager();
       int salary= manager1.getSalary();
        System.out.println("salary="+salary);
    }
}
