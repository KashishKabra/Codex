
import java.util.Scanner;

public class sumOfDigits {
    public static void main(String args[]){
        System.out.println("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int r,n=num,sum=0;
        while (n!=0){
            r=n%10;
            sum+=r;
            n=n/10;
        }
        System.out.println("sum of digits : "+sum);



    }
}
