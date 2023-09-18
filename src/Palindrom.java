import java.util.Locale;
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string to check if it is palindrome or not: ");
        String str = input.nextLine();
        str = str.toLowerCase();
        String rev = "";
        for(int i = str.length() - 1 ; i >= 0; i--){
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("The string entered " + str + " is a palindrome");
        }else{
            System.out.println("The string entered " + str + " is NOT a palindrome");
        }
    }
}
