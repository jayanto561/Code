import java.util.Scanner;
public class try_prattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n:");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=n;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
