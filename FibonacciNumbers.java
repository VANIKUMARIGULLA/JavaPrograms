public class FibonacciNumbers {
    public static void main(String[] args){
        /*
        0+1 = 1,
        1+1 = 2,
    
        */
        int a = 0, b = 1, c, count = 10;
        System.out.println(a);
        System.out.println(b);

        for(int i = 1; i <= count; i++){
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
        
    }
}
