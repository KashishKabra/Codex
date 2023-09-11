import java.util.Scanner;

public class spynumber {
    public static void main(String args[]){
        System.out.println("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int r,n=num,sum=0,mul=1;
        while (n!=0){
            r=n%10;
            sum+=r;
            mul*=r;
            n=n/10;
        }
        if(sum==mul){
            System.out.println(num+" is a spy number");
        }else{
            System.out.println(num+" is not a spy number");
        }



    }
}
