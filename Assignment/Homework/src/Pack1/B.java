package Pack1;

import Pack2.*;

public class B extends A {
    private int m = 12;
    private int get_mm(){
        return this.m;
    }
    protected int get_m(){
        return this.m;
    }


    public static void main(String[] args){
        A b = new A();
        b.x = 20;
        System.out.println("same package subclass protected variable m = "+ b.x);
        b.show();
    }
}
