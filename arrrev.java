import java.util.Arrays;

public class arrrev{
    public static void main(String args[]) {
        int[] arr = {1,2,3,4,5};
        System.out.println("original"+Arrays.toString(arr));

        rev(arr);

        System.out.println("reversed"+Arrays.toString(arr));
    }
    public static void rev(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            // swap the elements at start and end positions
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            // move the start and end positions towards the middle
            start++;
            end--;
            
        }
        }
    }