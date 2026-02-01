import java.util.Scanner;

public class CheckPalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :- ");
        String str = sc.nextLine();
        String reverse = checkPalindromeString(str);
        System.out.println("reverse = "+reverse);
        if(str.equals(reverse)) {
            System.out.println("It is Palindrome");
        } else {
            System.out.println("It is not Palindrome");
        }
        sc.close();
    }

    public static String checkPalindromeString(String str) {
        String reversed = "";
        for(int i=str.length()-1; i >= 0; i-- ) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}
