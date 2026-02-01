import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :- ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the Elements of An Array :- ");
        for(int i = 0;i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The Entered Array is :- ");
        for(int i=0; i<size; i++) {
            System.out.print(arr[i]+" ");
        }
        reverseAnArray(arr,size);
        sc.close();
    }

    public static void reverseAnArray(int arr[],int size) {
        int start = 0;
        int end = size - 1;
        
        while(start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.print("The reversed of an array is :- ");
        for(int i=0; i<size; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
}
