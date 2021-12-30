package org.example.OOPSConcept;

public class Employee {  //CLASS
    int empid;
    String empname;
    int salary;
    int deptno;

   /* Employee(int id, String name, int sal, int dpn) {
        empid = id;
        empname = name;
        salary = sal;
        deptno = dpn;
    }*/    // this method is responsible for intialising  values

    void setdata(int id, String name, int sal, int dpn)
    {
        empid = id;
        empname = name;  //This method is responsible for Printing the values
        salary = sal;
        deptno = dpn;
    }

    void display() {
        System.out.println(empid);
        System.out.println(empname);  // METHOD
        System.out.println(salary);
        System.out.println(deptno);
    }

    /*public static void main(String[] args) {
        Employee emp1= new Employee();     //OBJECT
        emp1.empid=101;
        emp1.empname="Sushma";// First Employee
        emp1.salary=50000;
        emp1.deptno=10;
        emp1.display();

        Employee emp2= new Employee();
        emp2.empid=102;
        emp2.empname="Rakesh";// Second EMployee
        emp2.salary=500000;
        emp2.deptno=11;
        emp2.display();*/

    //Assigning the class values using constructor
   /* public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Sushma", 50000, 10);
        emp1.display();
        Employee emp2 = new Employee(102, "Rakesh", 500000, 20);
        emp2.display();
    }*/

    //Assigning the class values using methods
    public static void main(String[] args) {
        Employee emp1= new Employee();
        emp1.setdata(101,"Sushma",400000,20);
        emp1.display();
        Employee emp2= new Employee();
        emp2.setdata(102,"Rakesh",1000000,25);
        emp2.display();

    }




}


