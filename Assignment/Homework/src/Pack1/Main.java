package Pack1;

public class Main {
    public static void main(String[] args) {
    A a = new A();
    a.access();
    a.show();
//     a.no_access();
        a.x = 20;
        System.out.println("same package protected member variable x = "+ a.x);

    }
}