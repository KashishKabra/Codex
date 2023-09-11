import java.util.Scanner;

public class string {
    public static void main(String args[]){
        System.out.println("Enter a word : ");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        sc.nextLine();
        System.out.println("Enter a line : ");
        String line = sc.nextLine();
        String together = word+" "+line;//concatenate
        System.out.println("Print together : \n "+together);
    }
}
