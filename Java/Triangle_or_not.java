import java.util.Scanner;

public class Triangle_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of a:");
        int a = sc.nextInt();
        System.out.print("enter the value of b:");
        int b= sc.nextInt();
        System.out.print("enter the value of c:");
        int c= sc.nextInt();
        if( a+b>c && b+c>c && c+a>b){
            System.out.println("A triangle");
        }

        else{
            System.out.println("NOt a triangle");
        }
        if (a == b && b== c && c==a) {
            System.out.println("Equilateral ");
            
        }
        else if (a==b || b==c || c==a) {
            System.out.println("isosceles");   
        }
        else {
            System.out.println("Scalene");
            
        }

    }
}
