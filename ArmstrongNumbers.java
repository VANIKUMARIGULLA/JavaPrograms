
public class ArmstrongNumbers {
    
    public static void main(String[] args) {

        int sum = 0;
        System.out.print("Armstrong Numbers between 1 and 1000 are: ");

        for(int i = 1; i <= 1000; i++){
            int n = i;

            while(n > 0){
                int b = n % 10;
                sum += b * b * b;
                n /= 10;
            }
        if(sum == i){
            System.out.print(i+" ");
        }
        sum = 0;
        }
    }
}
