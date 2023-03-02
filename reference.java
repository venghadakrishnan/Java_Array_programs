public class reference {
    public static void main(String[] args){
        int[] ar = {1,2,3,4,5};

        int len = ar.length;

        for(int i = 0; i<len; i++){
            // System.out.println(ar[i]);
            for(int j = i+1 ; j < len ; j++){
                System.out.println(ar[j]);
            }
            System.out.println();

        }
    }
    
}
