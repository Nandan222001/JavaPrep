import java.util.*;
public class ReverseTheString {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :-");
        String value = sc.nextLine();
        reversedString(value);
        sc.close();
    }

    public static void reversedString(String str) {
        char[] chars = str.toCharArray();
        int start = 0;
        int end = str.length() -1;
        while(start<end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }

        String reversed = new String(chars);
        System.out.println("Reversed String is :- "+reversed);
    }
}
