import java.util.Scanner;

public class Factor_print {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of N:");
        int n = sc.nextInt();
        for(int i =1;i<=Math.sqrt(n);i++){
            if (n%i==0) {
                System.out.println(i);
                System.out.println(n/i);
            }
        }

    }
}
