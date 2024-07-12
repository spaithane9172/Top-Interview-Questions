import java.util.Scanner;

public class GCD {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();
        if (a > b) {
            for (int i = b; i >= 1; i--) {
                if (a % i == 0 && b % i == 0) {
                    System.out.println("Result : " + i);
                    break;
                }
            }
        } else {
            for (int i = a; i >= 1; i--) {
                if (a % i == 0 && b % i == 0) {
                    System.out.println("Result : " + i);
                    break;
                }
            }
        }

    }

}
