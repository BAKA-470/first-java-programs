import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        float num1 = input.nextFloat();
        System.out.print("Enter the second number: ");
        float num2 = input.nextFloat();
        input.nextLine();
        System.out.print("Enter the operation of your choice(+,-,*, /): ");
        String operation = input.nextLine();
        if(operation.equals("+")){
            float s = num1 + num2;
            System.out.println("The sum of the given numbers is " + s);
        } else if (operation.equals("-")) {
            float d = num1 - num2;
            System.out.println("The difference of the given numbers is "+ d);
        } else if (operation.equals("*")) {
            float p = num1 * num2;
            System.out.println("The product of the given numbers is " + p);
        } else if (operation.equals("/")) {
            if (num2 > 0) {
                float div = num1 / num2;
                System.out.println("The division of the given numbers is " + div);
            } else {
                System.out.println(" num2 must be greater than 0 else it will be a zero/zero form (0/0)");
            }
        }
    }
}
