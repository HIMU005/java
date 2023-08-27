public class Try implements Call, Eat{
    @Override
    public void call() {
        System.out.println("Try class is calling");
    }

    @Override
    public void eat() {
        System.out.println("Try class is eatting");
    }
}
