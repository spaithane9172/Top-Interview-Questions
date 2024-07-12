import java.util.Scanner;

public class PerfectNumber {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        int sum = 0;
        if (n % 2 == 0) {
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
                if (sum == n) {
                    System.out.println(n + " is a perfect number.");
                    break;
                }
                if (sum > n) {
                    System.out.println(n + " is not a perfect number.");
                    break;
                }
            }
        } else {
            System.out.println(n + " is not a perfect number.");
        }
    }
}
