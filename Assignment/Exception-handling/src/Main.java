import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter an Integer number to devide: ");
            int x = scanner.nextInt();

            System.out.println("Enter an Integer number for devide by: ");
            int y = scanner.nextInt();

            int z = x/y;
            System.out.println(x+" / "+y+" = "+z);
        }
        catch (ArithmeticException e){
            System.out.println("A number can't devide by ZERO");
        }
        catch (InputMismatchException e)
        {
            System.out.println("You must inter an Integer");
        }
        catch (Exception e){
            System.out.println("Something went wrong");
        }
        finally {
            scanner.close();
        }

    }
}