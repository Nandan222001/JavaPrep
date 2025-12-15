import java.util.Scanner;
public class SwapingWithoutTemp {
    public static void swap(int num1,int num2) {
        num1 = num1+num2; // num1 = 30
        num2 = num1 - num2; //num2 = 10
        num1 = num1 - num2; // num1 = 20
        System.err.println("Value of First Number = "+num1); 
        System.err.println("Value of Second Number = "+num2); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter the First Number :- ");
        int a = sc.nextInt();
        System.err.print("Enter the Second Number :- ");
        int b = sc.nextInt();
        swap(a,b);
        sc.close();
    }
}
