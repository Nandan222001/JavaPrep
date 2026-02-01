import java.util.Scanner;

public class ReverseArray {
    public static void printReverseArray(int length,int arr[]) {
        System.out.println("Reversed Arrayis :- ");
        for(int i=length-1;i>=0;i--) {
            System.out.print(" "+arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:- ");
        int size = sc.nextInt();
        int[] arr =new int[size];
        for(int i=0;i<size;i++) {
            System.out.println("Enter the element :- ");
            arr[i] = sc.nextInt();
        }
        printReverseArray(size,arr);
    }
}
