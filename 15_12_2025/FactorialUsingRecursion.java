import java.util.Scanner;

public class FactorialUsingRecursion {
    public static int findFactorial(int num) {
        if(num == 1) {
            return 1;
        }
        return num * findFactorial(num - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the number to find the factorial :- ");
        int num = sc.nextInt();
        int result = findFactorial(num);
        System.err.println("The Factorial Of the number is :- "+result);
        sc.close();
    }
}
