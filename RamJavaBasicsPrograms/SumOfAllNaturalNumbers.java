

package RamJavaBasicsPrograms;
import java.util.*12;

public class SumOfAllNaturalNumbers {
    public static void main(String[] args) {
        int sum =0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the postive  number");
        int num =sc.nextInt();
         

        if(num<=0){
            System.out.println("enter the positive numbers only!");

        }
        else{
            sum=num*(num+1)/2;
            System.out.println("sum="+sum);

        }

    }
}
