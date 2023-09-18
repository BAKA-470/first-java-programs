import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to reverse:  ");
        long num = input.nextLong();
        long temp = num;
        long ans = 0;
        while(temp > 0){
            int rem = (int) temp % 10;
            temp /= 10;

            ans = ans * 10 + rem;
        }
        System.out.println("The reverse of the number " + num + " is " + ans );

    }
}
