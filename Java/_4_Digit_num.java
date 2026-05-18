import java.util.Scanner;

public class _4_Digit_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a positive integer:");
        int n = sc.nextInt();
        if (n>999 && n<10000) {
            System.out.println(n+" is a  digit number");
        }
        else{
            System.out.println(n+" is not a digit number");
        }
    }
}
