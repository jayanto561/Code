import java.util.Scanner;

public class Devided_by_4_or_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int n =sc.nextInt();
        if (n%4==0 || n%7==0) {
            System.out.println(n+" is divided by 4 or 7");
        }
        else{
            System.out.println(n+" is not divided by 4 or 7");
        }
    }
}
