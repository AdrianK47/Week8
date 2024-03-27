import java.util.*;
public class Factorial {
    public static void main(String args[]){
        int number;
        int factorial = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextInt();

        for (int i = 1; i <= number; i++){
            factorial *= i;
        }
        System.out.println("This is the factorial from 1 to " + number + " : " + factorial);
    }
}