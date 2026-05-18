import java.util.Scanner;

public class Try_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of n:");
        int n = sc.nextInt();
        for(int i=0,j=n;i<=j;i++,j--){
            System.out.println(i);
            if (i!=j) {
                System.out.println(j);
                
            }
        }       
    }
}
