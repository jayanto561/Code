import java.util.Scanner;
public class floyed_tri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n =sc.nextInt();
        int a=1;
        for(int i= 0;i<n;i++){
            for(int j =0;j<i;j++){
                System.out.print(a++ +" ");
            }
            System.out.println();
        }
    }
}
