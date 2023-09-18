import java.util.Scanner;

public class Count_digit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number in which you want to check the count:  ");
        long number = input.nextLong();
        System.out.print("Enter the digit whose count you want to check: ");
        int digit = input.nextInt();
        int count = 0;
        long num = number;
        while(number > 0){
            int rem = (int) (number % 10);
            number /= 10;
            if(rem == digit){
                count++;
            }
        }
        System.out.println("The count of the digit " + digit + " in number " + num + " is " + count);
    }
}
