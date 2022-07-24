package constructors;

import java.util.ArrayList;

public class Microsoft {

    public static void main(String[] args) {

        Employee employeeOne = new Employee(); // Calling for the default constri=uctor

        employeeOne.salary = 120000;
        System.out.println(employeeOne.toString());


        employeeOne.name = "Jasur";
        employeeOne.ID = 101;
        employeeOne.jobTitle = "Technical Manager";

        Employee employeeTwo = new Employee("Efe", "QA Lead", 201, 110000);

        ArrayList<Employee> team = new ArrayList<>();

        team.add(employeeOne);
        team.add(employeeTwo);

        team.add((new Employee("Jamal", "SDET", 301, 120000)));


        // let's find Max salary from team list

        double maxSalary = Double.MIN_VALUE;
        for (Employee each : team) { // each is an Employee object

            if (each.salary > maxSalary) {
                maxSalary = each.salary;
            }
        }
        System.out.println("maxSalary = " + maxSalary);

        // I wanna find Jamal's job title

        for (Employee each : team) {
            if (each.name.equalsIgnoreCase("jamal")) {
                System.out.println(each.jobTitle);
            }
        }
        /*
        Note you can change or call the static field through object or ClassName, but second one is preferable
         */

        //employeeOne.companyName = "Tesla"; It is changed with static fieldobject static
        Employee.companyName = "Tesla";
        // company name for each employee
        for (Employee each: team) {
            System.out.println(each.name+ " is working for " + each.companyName );

        }
    }
}