package org.example.OOPSConcept;

public class Employee1 {
    int empid;
    String empname; //Using Object
    int salary;
    int deptno;

   /* Employee(int id, String name, int sal, int dpn)

    {
        empid = id;
        empname = "name";
        salary = sal;
        deptno = dpn;
    }*/

    void display() {
        System.out.println(empid);
        System.out.println(empname);  // METHOD
        System.out.println(salary);
        System.out.println(deptno);
    }

    public static void main(String[] args)
    {
        Employee1 emp1 = new Employee1();     //OBJECT
        emp1.empid = 101;
        emp1.empname = "Sushma";// First Employee
        emp1.salary = 50000;
        emp1.deptno = 10;
        emp1.display();

        Employee1 emp2 = new Employee1();
        emp2.empid = 102;
        emp2.empname = "Rakesh";// Second EMployee
        emp2.salary = 500000;
        emp2.deptno = 11;
        emp2.display();

    }
}

