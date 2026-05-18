import java.util.Scanner;

public class magnitude {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number:");
        int n =sc.nextInt();
        if (n<0)
            n=-n;
       if (n<69) {
        System.out.println(n+" the number is less then 69");
       } 
       
    }
}
