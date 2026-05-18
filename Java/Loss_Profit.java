import java.util.Scanner;

public class Loss_Profit {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the cp:");
    double cp = sc.nextDouble();
    System.out.println("enter the sp:");
    double sp = sc.nextDouble();
    double n = sp-cp;

    if (cp<sp) {
        System.out.println(n+" profit");
    }
    if (cp>sp) {
        System.out.println("Loss "+-n);
    }
    if (cp==sp) {
        System.out.println("no profit no loss");
    }
    }
}
