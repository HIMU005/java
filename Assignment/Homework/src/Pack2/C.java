package Pack2;

import Pack1.*;

public class C extends B {
public static void main(String[] args) {
    B c = new B();
    C d = new C();
    System.out.println(d.get_m());      //protected

    d.access();             //different package class

}
}
