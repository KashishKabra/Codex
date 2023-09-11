import java.util.Scanner;
public class table {
    public static void main(String args[]){
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("----TABLE----");
        for (int i = 1; i <= 10; i++ ){
            int mul = 0;
            mul = num * i;
            System.out.println(num+" x "+i+" = "+mul);
        }
    }
}
