import java.util.Scanner;

public class pattern_for {
    public static void main(String[] args) {
        System.out.println("enter the value:");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if (i==0||i==n||j==0||j==n) {
                  System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

        
    }
}
