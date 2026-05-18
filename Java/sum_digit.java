import java.util.Scanner;

public class sum_digit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        int m=0;
        while(n!=0){
            m +=n%10;
            n/=10;

        }
        System.out.println("sum of the digit is:"+((m>0)?  m : -m));
    }
} 
