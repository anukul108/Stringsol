import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String check = sc.nextLine();
        int j = check.length();
        int flag = 0;
        for (int i = 0; i < j / 2; i++) {
            if (check.charAt(i) == check.charAt(j - 1 - i)) {

            }

            else {
                flag = 1;
            }
        }

        if (flag == 1) {
            System.out.println("String is not palindrome");
        }

        else {
            System.out.println("String is palindrome");
        }
    }
}
