import java.util.*;
public class EvenOddNumbers {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range number: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            if(i%2 == 0){
                System.out.println("Even Numbers are: " + i);
            }
            //else{
                //System.out.println("Odd Numbers are: " + i);
            //}
        }
        
    sc.close();    
    }
}
