import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        float r = input.nextFloat();
        double area = (float) (Math.PI * r * r);
        System.out.println("The area of the circle with radius " + r + " is " + area);
    }
}
