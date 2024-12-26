package Abstraction;
 interface Mytest {
    void write();
    void read();
}
class SBIread implements Mytest {
  public void write(){
  System.out.println("it is not allowed in abstract class or method.we cannot call this method");
}
public void read(){
    System.out.println("SBIread");
}
}