public class spevalue {
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5,6,7};
        int j = 1;
        boolean contains = false;
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i]==j){
                contains = true;
                break;
            }     
        }
        if(contains){
            System.out.println("yes contains "+j);
        }else{
            System.out.println("not contains "+j);
        }
    }
    
}
