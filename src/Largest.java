import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        float num1 = input.nextFloat();
        System.out.print("Enter the second number: ");
        float num2 = input.nextFloat();
        if(num1 > num2){
            System.out.println("The number " + num1 + " is greater than " + num2);

        }else if(num2 > num1){
            System.out.println("The number " + num2 + " is greater than " + num1);
        }else{
            System.out.println("Both the numbers are equal");
        }
    }
}
