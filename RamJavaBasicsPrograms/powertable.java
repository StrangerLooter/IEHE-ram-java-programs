import java.util.Scanner;

public class powertable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take number input
        System.out.print("Enter the base number: ");
        int base = sc.nextInt();

        // Take how many powers you want
        System.out.print("Enter the maximum power (n): ");
        int n = sc.nextInt();

        int result = 1; // to store base^i
        for (int i = 1; i <= n; i++) {
            result *= base; // multiply step by step
            System.out.println(base + "^" + i + " = " + result); //this will print like-  2^1=2  then 2^2=4
        }

        sc.close();
    }
}
