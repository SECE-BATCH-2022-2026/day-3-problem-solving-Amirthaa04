import java.util.*;
import java.io.*;
public class RepeatFront {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter a number (n): ");
        int n = sc.nextInt();
        String front;
        if (str.length() <= 3) {
            front = str;
            n = 3;
        } else {
            front = str.substring(0, 3);
        }
        String result = "";
        for (int i = 0; i < n; i++) {
            result += front;
        }
        System.out.println("Result: " + result);
    }

}

