public class Tri implements Call, Eat{
    @Override
    public void call() {
        System.out.println("Tri class is calling");
    }

    @Override
    public void eat() {
        System.out.println("Tri class is eatting");
    }
}
