import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number till you want to print the fibonacci series: ");
        int num = input.nextInt();
        int a = 0, b = 1, c;
        for(int i = 2; i <= num; i++){
            c = a + b;
            a = b;
            b = c;
            System.out.println( " " + b + " ");
        }
        System.out.println("The last number is " + b);
    }

}
