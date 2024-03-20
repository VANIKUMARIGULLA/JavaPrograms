import java.util.*;
public class FactorialNumber {
    public static void main(String[] args){
        int fact = 1;
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            fact = fact*i;
        }
        System.out.println(fact);
    sc.close();
    }
}
