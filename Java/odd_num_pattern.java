import java.util.Scanner;
public class odd_num_pattern {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);  
        System.out.println("enter the value:");
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
                    int m = 1;
            for(int j =0;j<i;j++){
                System.out.print(m+" ");
                  m+=2;
            }
            System.out.println();
        }
    }
}
