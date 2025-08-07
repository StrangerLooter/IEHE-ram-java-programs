package RamJavaBasicsPrograms;
import java.util.*;
public class FibonaaciFunction {
    public static  void printFibonacci(int n){
        int a =0;
        int b=1;
        for ( int i=0;i<=n;i++){
            System.out.println(a+" ");
            int next= a+b;
            a=b;
            b=next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of terms");
        int n=sc.nextInt();
        System.out.println("fibonacci series upto "+n+ " terms");
        printFibonacci(n);
        sc.close();
    }
    
}
