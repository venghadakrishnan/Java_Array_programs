import java.util.Arrays;

//to remove specific value which is given in the array

public class remove {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};

        int rem = 2;

        for(int i = rem;i<arr.length-1;i++){
            arr[i] = arr[i+ 1] ; 
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
