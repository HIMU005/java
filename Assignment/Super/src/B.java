public class B extends A{
    int c;
    B(int a, int b, int c){
        super(a, b);
        this.c = c;
    }
    int sum(){
       return this.a+this.b+this.c;
    }

}
