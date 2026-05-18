import java.util.Scanner;
public class pluse_pattern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the value of N:");
        int n =sc.nextInt();
        int mid=n/2;
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                if (i ==mid||j==mid) {
                    System.out.print("* ");
                }
        else{
            System.out.print("  ");
            }
           
        }
         System.out.println();
        }
    }
}
