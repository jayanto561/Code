import java.util.Scanner;
public class Suqare_rectangle_print {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the value of row:");
        int n = sc.nextInt();
        System.out.print("enter the value of colmn:");
        int m =sc.nextInt();
        for(int i =0;i<n;i++){           //koita line hoibo
            for(int j=0;j<m;j++){       // koita star hoibo
            System.out.print("* ");
        }
        System.out.println();
    }
}
}