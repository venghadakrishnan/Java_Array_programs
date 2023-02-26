public class sum {
    public static void main(String[] args){
        int[] p =  {1,2,3,4,5};
        int sum = 0;
        for(int i = 0 ;i<p.length;i++)
        // for(int i : p)   for each loop
            sum += p[i];
            System.out.print(sum);
    }
    
}
