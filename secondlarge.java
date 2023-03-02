import java.util.Arrays;
import java.util.Scanner;

public class secondlarge {

    public static void second(int[] arr){
        int len= arr.length;

        if(len<2){
            System.out.println("Only two elements in the arrya");
            return;
        }

        //make the array in ascending order

        Arrays.sort(arr);

        for(int i = len - 2; i>=0;i--){
            if(arr[i] != arr[len-1]){

                System.out.println("the second largest element is " +arr[i]); 
                return;

            }

  
        }
        System.out.println("there is no second element");

    }
    public static void main(String[] args){

        int[] arr = {34,1,2,35};
        second(arr);
    
}
}
