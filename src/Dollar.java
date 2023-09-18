import java.util.Scanner;

public class Dollar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of INR you want to convert to USD: ");
        float inr = input.nextFloat();
        float c = 83.09f;
        float usd = inr/c;
        System.out.println("Your amount " + inr + " in INR is equals to " +usd+ "USD");
    }
}
