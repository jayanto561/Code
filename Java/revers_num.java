import java.util.Scanner;

public class revers_num {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        int m = 0;
        int y=0;
        while(n!=0){
            m*=10;
            m+=n%10;
            y+=n%10;

            n/=10;

        }
        System.out.println("revers of the digit is:"+m+" sum of the num: "+y);
    }
} 
