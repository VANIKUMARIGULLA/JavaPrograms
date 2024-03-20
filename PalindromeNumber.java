import java.util.*;
public class PalindromeNumber {
    
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        int r;

        //iteration:1
        //number = 121
        //r = 121%10 = 1
        //sum = (0*10)+1 = 1
        //n = 121/10 = 12
        
        //iteration:2
        //12 > 0 = correct
        // 12%10 = 2
        //sum = (1*10)+2 = 12
        // n = 12 / 10 = 1

        //iteration:3
        //1 > 0 = correct
        //r = 1 % 10 = 1
        //sum = (12 * 10)+1 = 121
        //n = 1 /10 = 0.1

        //iteration:4
        // 0.1 > 0 = wrong
        //Exit

        while(n > 0){
            r = n % 10;
            sum = (sum*10) + r;
            n /= 10;
        }
        if(temp == sum){
            System.out.println(" Palindrome Number");
        }
        else{
            System.out.println("not a Plindrome Number");
        }
    sc.close();
    }
}
