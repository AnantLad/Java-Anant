package Abstraction;
// Abstraction is process in which we hide the background implimention details and provide essentials information only.
public abstract class Test {
    String name;

    abstract void readData();
    abstract void writeData();  
}
 class Admin extends Test {
    void readData(){
        System.out.println("Hello");// it is not allowed in abstract class or method.we cannot call this method. 
    }
   void writeData(){}
}

 class Marketing extends Test{ 
    void readData(){}
    void writeData(){}  
}
class Abstraction{
    public static void main(String[] args) {

        SBIread SBIread = new SBIread();
        SBIread.read(); 
        SBIread.write();
    }
}