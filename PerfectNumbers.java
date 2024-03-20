
public class PerfectNumbers {
    public static void main(String[] args)
    {
       int num, start=1, end=50, i, sum;
       
       System.out.println("----Perfect Numbers between 1 to 1000----");
       for(num=start; num<=end; num++)
       {
          sum = 0;
          for(i=1; i<num; i++)
          {
             if(num%i==0)
                sum = sum+i;
          }
          if(sum==num)
             System.out.print(num+ " ");
       }
    }
}
