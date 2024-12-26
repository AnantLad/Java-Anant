package Polymorphism;

/*  Polymorphism allows us to perform a single action in different ways. 
In other words, polymorphism allows you to define one interface and have multiple implementations.
 The word “poly” means many and “morphs” means forms, So it means many forms. */
class Employee {
    void salary() {
        System.out.println("Bace salary");
    }
}

class FullTimeEmployee extends Employee {
    void salary() {
        System.out.println("Full time employee salary is 30,000");
    }
}

class PartTimeEmployee extends Employee {
    void salary() {
        System.out.println("Part time employee salaryis 15,000");
    }
}

public class Overriding {
    /*
     * Run time polymorphism
     * Dynamic polymorphism
     * Dynamic dispatch
     * If subclass (child class) has the same method as declared in the parent class
     */
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee();
        Employee emp2 = new PartTimeEmployee();
        emp1.salary();
        emp2.salary();

    }
}