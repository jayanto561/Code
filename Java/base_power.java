import java.util.Scanner;

public class base_power {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the value of base:");
        int n = sc.nextInt();
        System.out.print("enter the value of power:");
        int m =sc.nextInt();
        int u=1;
        for(int i=1;i<=m;i++){
           u*=n;

        }
                System.out.println("factorial :"+u);

        }
    }
