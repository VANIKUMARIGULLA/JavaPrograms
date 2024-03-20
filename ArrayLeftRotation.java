public class ArrayLeftRotation {
    public static void main(String[] args){
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int n = 3;

        // Taking an array as input : {1, 2, 3, 4, 5}
        // left Ratotion Times = 3

        //Rotation start and rotate 3 times based on given input
        for(int i = 0; i < n; i++){
            //declaring first = first element in the given array as arr[0] 
            int first = arr[0], j;

            // Taking another for loop for rotate array upto original length of the given array
            for(j = 0; j < arr.length - 1; j++){
                arr[j] = arr[j+1];
            }
            
            arr[j] = first;
        }
        // print the final array after completing the 3 left rotations
        for(int i = 0; i < arr.length; i++){
            //prints output array as : 4 5 1 2 3
            System.out.print(arr[i] + " ");
        }
    }
}