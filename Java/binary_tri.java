import java.util.Scanner;
public class binary_tri {
    public static void main(String[] args) {
        System.out.print("enter the value of n:");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for(int i = 0;i<n;i++){
            for(int j=0;j<i;j++){
                if((i+j)%2==0){
                System.out.print("0 ");
            }
            else{
                System.out.print("1 ");
            }
        }
                    System.out.println();

    }
}
}
