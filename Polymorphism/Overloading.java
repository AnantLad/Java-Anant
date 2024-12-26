package Polymorphism;

class Printer {
    void print(int value) {
        System.out.println("Integer: " + value);
    }

    void print(double value) {
        System.out.println("Double: " + value);
    }

    void print(String value) {
        System.out.println("String: " + value);
    }

    void print(Boolean value) {
        System.out.println("Boolean: " + value);
    }

}

public class Overloading {
    /*
     * Compile time polymorphism
     * Static polymorphism
     * When there are multiple functions with the same name but different parameters
     * then these functions are said to be overloaded
     */
public static void main(String[] args) {
    Printer printer = new Printer();
    printer.print(28);
    printer.print(20.80);
    printer.print("Anant");
    printer.print(true);
}
}
