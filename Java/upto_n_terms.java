import java.util.Scanner;

public class upto_n_terms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of N " );
        int n = sc.nextInt();
        for(int i =2;i<=3*n-1;i+=3){
            System.out.println(i);
        }
    }
}
