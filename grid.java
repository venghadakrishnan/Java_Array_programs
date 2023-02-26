public class grid {

    public static void main(String[] args){
        int[] g = new int[10];
        for(int i = 0;i <10;i++)
        {
            for(int j = 0; j<10;j++)
            {
            System.out.printf("*"+g[i],g[j]);
            }
        System.out.println();
        }
    }
}
