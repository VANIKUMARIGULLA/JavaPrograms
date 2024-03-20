import java.util.*;
public class LCM {
    public static void main(String[] args){
        System.out.print("Enter Fisrt Number: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int n2 = sc.nextInt();
        int gcd = 1, lcm;
        
        for(int i = 1; i <= n1&& i <= n2; i++){
            if(n1 % i == 0 && n2 % i == 0){
                gcd = i;
            }
        }
        lcm = (n1 * n2) / gcd;
        System.out.println("lcm of two number: "+ lcm);
    sc.close();
    }
}
