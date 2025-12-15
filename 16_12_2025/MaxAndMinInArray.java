import java.util.Scanner;

public class MaxAndMinInArray {

    public static int findMax(int arr[],int length) {
        int max = arr[0];
        for(int i=0;i<length;i++) {
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMin(int arr[],int length) {
        int min = arr[0];
        for(int i=0;i<length;i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the Size of the array :- ");
        int size = sc.nextInt();
        int[] arr =new int[size];
        for(int i=0;i<size;i++) {
            System.out.print("Enter the Element :- ");
            arr[i] = sc.nextInt();
        }
        int max = findMax(arr,size);
        int min = findMin(arr,size);
        System.out.println("Maximum Element in an Array is :- "+max);
        System.out.println("Minimum Element in an Array is :- "+min);
        sc.close();
    }
}
