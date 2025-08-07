package RamJavaBasicsPrograms;
import java.util.*;

public class powertable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get base and exponent from user
        System.out.print("Enter the base number: ");
        int base = sc.nextInt();
        
        System.out.print("Enter the maximum exponent: ");
        int maxExponent = sc.nextInt();
        
        // Generate power table
        System.out.println("\nPower Table for base " + base + ":");
        System.out.println("Exponent\tResult");
        System.out.println("--------\t------");
        
        for (int exponent = 0; exponent <= maxExponent; exponent++) {
            int result = (int) Math.pow(base, exponent);
            System.out.println(exponent + "\t\t" + result);
        }
        
        sc.close();
    }
}
