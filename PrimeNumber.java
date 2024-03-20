import java.util.*;
public class PrimeNumber {
    
    public static void main(String[] args){
        int count = 0;
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            if(n%i == 0)
                count++;
        }
        if(count == 2)
            System.out.println("Given number is Prime Number");
        else
            System.out.println("Given number is not a Prime Number");
    sc.close();
    }
}

