import java.util.Scanner;

public class StringAnagram {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine(), str2 = sc.nextLine();
        if (str1.length() == str2.length()) {

        } else {
            System.out.println("Strings are not anagramsw");
        }

    }
}
