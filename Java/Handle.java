public class Handle {

    public static void main (String[] args){
        try{
            int a = 4 / 0;
        }
    catch(ArithmeticException e){
        System.out.println("ArithmrticExceotion" +e.getMessage());
    }
    finally {
        System.out.println("error find its show every time");
    }
    }
}