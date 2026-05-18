import java.util.Scanner;

public class Integer_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        double y =sc.nextDouble();

        int x = (int)y;
        if (y-x==0) {
            System.out.println(y+" is a Integer number");
        }
        else{
            System.out.println(y+" isn't a integer:");
        }
    }
}
