public class SwapTwoNumbers {
    public static void main(String[] args) {

        //Without Using Third Variable.
        int a = 10;
        int b = 20;

        System.out.println("Before Swapping: " + a + " " + b);

        a = a + b;
        b = a - b;
        a = a - b; 

        System.out.println("After Swapping: "+ a + " " + b);
    }
}
