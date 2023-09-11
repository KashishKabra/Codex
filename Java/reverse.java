import java.util.Scanner;

public class reverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        int len;
        len = str.length();
        for(int i=len-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}
