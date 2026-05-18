import java.util.Scanner;
public class odd_or_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int n = sc.nextInt();
        if (n%2==0) {
            System.out.println(n+" is a even number");
        }
        else{
            System.out.println(n+" is a odd number");

        }

        System.out.println(" know divied by 5 or not");
        int m = sc.nextInt();
        if (m%5 == 0) {
            System.out.println(m+" is divided by 5");
        }
        else
            System.out.println(m+" is not divided by 5");
    




        //Absulotevalue
        System.out.println("enter for absulotevalue:");
        int h = sc.nextInt();
        if(h>=0){
            System.out.println(h+" here the num");
        }else{
            System.err.println(-h+" here the num");
        }
    
    }
}
