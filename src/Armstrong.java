import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if it is an armstrong number or not: ");
        int num = input.nextInt();
        int num1 = num;
        int sum = 0;
        while(num1 > 0){
            int a = num1 % 10;
            sum += a * a * a;
            num1 = num1 / 10;
        }
        if(num == sum){
            System.out.println("The number " + num + " is an armstrong number");
        }else{
            System.out.println("The number " + num + " is NOT an armstrong number");
        }

    }
}
