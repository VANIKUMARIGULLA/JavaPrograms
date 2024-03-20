import java.util.*;
public class GCD {
    public static void main(String[] args){
        System.out.print("Enter First Number: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int n2 = sc.nextInt();
        int gcd = 1;

        for(int i = 1; i <= n1 && i <= n2; i++){
            if(n1 % i == 0 && n2 % i == 0){
                gcd = i;
            }
        }
        System.out.println("gcd of numbers: " + gcd);
    sc.close();
    }
}
