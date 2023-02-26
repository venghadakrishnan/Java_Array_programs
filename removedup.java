import java.util.Arrays;

public class removedup {

    static void venkatdup(int[] array){
        
        for(int i = 0 ; i<array.length;i++){
            System.out.println(array[i]+"\t");
        }
        int len = array.length;
            for(int i = 0 ; i<len;i++){
                for(int j =i+1 ; j<len;j++){
                    if(array[i] == array[j]){
                        // replacing the duplicates by the corresponding next integer
                        array[j] = array[len-1];
                        len--;
                        j--;
                    }
                }
        }
        // copying the array to print the dupliactes after the process::
        int[] arr1 = Arrays.copyOf(array, len);
        Arrays.toString(arr1);
        System.out.println();
        for(int i = 0; i<arr1.length;i++)
        {
            System.out.println(arr1[i]+"\t");
        }
        System.out.println();
    } 

    public static void main(String[] args){
        venkatdup(new int[] {1,2,33,33,4,5,6});
    }
    
}
