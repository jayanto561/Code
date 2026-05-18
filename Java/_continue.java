public class _continue {
    public static void main(String[] args) {
        for(int i =1;i<100;i++){
            if (i%2==0) {
                continue;
            }
            System.out.println(i);
            if (i==13) {
                continue;
                
            }
            System.out.println("good morning");
        }
    }
}
