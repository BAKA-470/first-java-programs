import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a number you want to check weather it is even or odd: ");
       int i = input.nextInt();
       if(i % 2 == 0){
           System.out.println("The number "+ i + " is even");
       }
       else{
           System.out.println("The number "+ i + " is odd");
       }
    }

}