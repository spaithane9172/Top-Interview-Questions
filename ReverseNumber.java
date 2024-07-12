// Method 1

// import java.util.Scanner;

// public class ReverseNumber {
//     public static void main(String argc[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt(), r = 0;
//         System.out.println("Number Before Reverse : " + n);
//         while (n != 0) {
//             r = r * 10 + (n % 10);
//             n -= (n % 10);
//             n /= 10;
//         }
//         System.out.println("Number After Reverse  : " + r);
//     }
// }

//Method 2

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        System.out.println("Number Befre Reverse : " + n);
        String s = String.valueOf(n), r = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            r += s.charAt(i);
        }
        n = Integer.valueOf(r);
        System.out.println("Number after Reverse : " + n);
    }
}