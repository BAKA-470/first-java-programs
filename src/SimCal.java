import java.util.Scanner;

public class SimCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            int ans ;
            System.out.print("Choose an operator('+','-','*','/'): ");
            char operation = input.next().trim().charAt(0);
            if(operation == '+' || operation == '-' || operation == '*' || operation == '/'){
                System.out.print("Enter the first number: ");
                int num1 = input.nextInt();
                System.out.print("Enter the second number: ");
                int num2 = input.nextInt();

                if(operation == '+'){
                    ans = num1 + num2;
                    System.out.println("Your answer is " + ans);
                } else if (operation == '-') {
                    ans = num1 - num2;
                    System.out.println("Your answer is " + ans);
                } else if (operation == '*') {
                    ans = num1 * num2;
                    System.out.println("Your answer is " + ans);
                } else if (operation == '/') {
                    if(num2 > 0 ){
                        ans = num1 / num2;
                        System.out.println("Your answer is " + ans);
                    }else{
                        System.out.println("Second number cannot be zero!!!!");
                    }
                }
            }else if(operation == 'x' || operation == 'X'){
                break;
            }else {
                System.out.println("Invalid operation selection, please select again!!!");
            }



        }


    }
}
