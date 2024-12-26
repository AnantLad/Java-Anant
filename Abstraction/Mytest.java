package Abstraction;
 interface Mytest {
    void write();
    void read();
}
class SBIread implements Mytest {
  public void write(){
  System.out.println("SBIwrite");
}
public void read(){
    System.out.println("SBIread");
}
}