import java.util.Scanner;

public class _count_digit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number:");
        int n= sc.nextInt();
        int count =0;
        if (n==0) n=1;
        int i =1;
        while(n!=0){
            n/=10;
            count++;
        }
    System.out.println("the number has "+count);
    }
}
