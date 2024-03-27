import java.util.*;
public class OddSum {
    public static void main(String args[]){
        int number;
        int sum = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextInt();

        for (int i = 1; i <= number; i++){
            if (i % 2 == 1){
                sum += i;
            }
        }
        System.out.println("The sum of the odd numbers within 1 to " + number + " is: " + sum);
    }
}
