import java.util.Scanner;

public class Palindrome {
    public static boolean palindrome(int num) {
        int temp = num;
        int sum = 0;
        while(num>0) {
            int rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10 ;
        }
        if(temp == sum) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter the number to check if it is palindrome or not :- ");
        int num = sc.nextInt();
        if(palindrome(num)) {
            System.err.println("The Number is Palindrome");
        } else {
            System.err.println("The number is not Palindrome");
        }
        sc.close();
    }
}
