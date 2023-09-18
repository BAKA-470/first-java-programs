import java.sql.SQLOutput;
import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("What is your name??? ");
        System.out.print("My name is ");
        String fname = name.nextLine();
        System.out.println("Hi there, " + fname + " it's nice to meet you!!!");

    }
}
