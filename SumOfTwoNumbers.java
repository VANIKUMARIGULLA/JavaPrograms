import java.util.*;
public class SumOfTwoNumbers {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int n = sc.nextInt();

        System.out.print("Enter the Second Number: ");
        int m = sc.nextInt();

        int Sum = n + m;
        System.out.println("Sum of the Two Numbers is : " + Sum);

    sc.close();
    }
}
