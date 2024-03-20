import java.util.*;
public class PrimeNumbers {
    public static void main(String[] args){
        int count = 0;
        System.out.print("Enter the Starting Range Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter the Ending Range Of Numbers: ");
        int p = sc.nextInt();

        for(int i = n; i <= p; i++){
            for(int j = 2; j < i; j++){
                if(i%j == 0){
                    count = 0;
                    break;
                }
                else{
                    count = 1;
                }
            }
            if(count == 1)
                System.out.println(i);
        }
    sc.close();
    }
}

