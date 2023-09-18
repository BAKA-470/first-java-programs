import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter the Principal amount: ");
        double p = input.nextDouble();
        System.out.print(" Enter the Time you want to invest money for(in years) : ");
        float t = input.nextFloat();
        System.out.print(" Enter the rate of interest: ");
        float r = input.nextFloat();

        double si = (p*r*t) / 100;
        System.out.println("The S.I for the principal amount of " + p + " at the rate of interest of " + r + "% for time " + t + " years is " + si );
    }
}
