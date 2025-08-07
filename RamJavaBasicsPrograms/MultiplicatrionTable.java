package RamJavaBasicsPrograms;
import java.util.*;

public class MultiplicatrionTable {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the number:");
        int n = sc.nextInt();
        for(int i=0; i<=11; i++){
            
            System.out.println(i*n);
        }


    }
    
}
