import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String a[]) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        int i = 0;
        while (arr.get(arr.size() - 1) < n) {
            arr.add(arr.get(i) + arr.get(i + 1));
            i++;
        }
        for (int j : arr) {
            System.out.print(j + ", ");
        }
    }
}
