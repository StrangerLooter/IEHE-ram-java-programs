import java.util.Scanner;

public class MultiBasePowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for number of base values
        System.out.print("How many base numbers you want to enter? ");
        int n = sc.nextInt();

        int[] bases = new int[n]; // store base numbers

        // Take base numbers input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter base number " + (i + 1) + ": ");
            bases[i] = sc.nextInt();
        }

        // Ask for max exponent
        System.out.print("Enter maximum exponent: ");
        int limit = sc.nextInt();

        // For each base, print powers
        for (int base : bases) {
            int result = 1;
            System.out.println("\nPowers of " + base + ":");
            for (int i = 1; i <= limit; i++) {
                result = result * base;
                System.out.println(base + "^" + i + " = " + result);
            }
        }

        sc.close();
    }
}
