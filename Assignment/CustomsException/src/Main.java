import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        try{
            checkAge(age);
        }
        catch (Exception e){
            System.out.println("A problem occured "+ e);
        }
    }
    static void checkAge(int age) throws AgeException{
        if(age < 18){
            throw new AgeException("You need to 18+ for to permission for driving");
        }
        else {
            System.out.println("You can apply for driving licence");
        }
    }
}