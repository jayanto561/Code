import java.util.Scanner;

public class ternary_basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number for odd or even:");
        int a = sc.nextInt();
        System.out.println((a%2==0)? "even" : "odd");
    }
}
