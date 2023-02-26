public class avgary {
    public static void main(String[] args){
        int[] a = {1,4,5,6,7};
        // int b = a.length;
        double sum = 0;
        for(int i = 0;i<a.length;i++){
            sum = sum + a[i]; 
        }    
        double avg = sum/a.length;
        System.out.println(avg);
    }
}
