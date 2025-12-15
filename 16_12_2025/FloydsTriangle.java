import java.util.Scanner;

public class FloydsTriangle {
    public static void printFloydsTriangle(int rows) {
        int num=1;
        for(int i=1;i<=rows;i++ ){
            for(int j=0;j<=i;j++) {
                System.out.print((num++)+" ");
            }
            System.err.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the number of rows :- ");
        int rows = sc.nextInt();
        printFloydsTriangle(rows);
        sc.close();
    }    
}
