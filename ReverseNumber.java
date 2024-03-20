import java.util.*;
public class ReverseNumber {
    public static void main(String[] args){

        System.out.print("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reversed = 0;

        while(n != 0){
            int digit = n % 10;
            reversed = (reversed*10)+ digit;
            n /= 10;
        }
        System.out.print("Reversed Number is: " + reversed);
    sc.close();
    }
}
