package constructors;

public class Employee  {
    //    attributes/fields/variables
    public String name, jobTitle;
    public int ID;
    public double salary; // instance variable, belongs to Object
    public static String companyName; // static field belongs to Class


    static{
        companyName= " Microsoft"; //
    }

    public Employee(){
        salary = 10000; // when

    }

    public Employee(String n, String jobTitle, int ID, double salary){

        name = n;
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.salary = salary;


    }

}
