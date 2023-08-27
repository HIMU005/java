package Pack1;
import Pack2.*;

public class A {
    private void no_access(){
        System.out.println("I am private method");
    }
    public void access(){
        System.out.println("I am public method");
    }
    protected int x;
    void show(){
        System.out.println("I am default method");
    }
}
