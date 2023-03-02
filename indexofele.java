public class indexofele {
   
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int searchele = 6;
        int notfound = -1;

        for(int i = 0; i<arr.length;i++){
            if(arr[i]==searchele){
                notfound = i;
                break;
            }
        }

        if(notfound!= -1){
            System.out.println("the index of the given element is"+notfound);

        }else{
            System.out.println("the given element is not in array");
        }

        
    }
    
}
