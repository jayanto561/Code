import java.util.Scanner;

public class Composite {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the number:");
        int n =sc.nextInt();
        for(int i = 2;i<=Math.sqrt(n) ;i++){
            if (n%i==0) {
                System.out.println(n+" is a Composite number");
                break;
                
            }else{
                System.out.println(n+"this number isnot composite number");
                break;
            }
        }
    }
}
