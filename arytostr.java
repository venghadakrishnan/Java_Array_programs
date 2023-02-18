import java.util.Arrays;

public class arytostr{
    public static void main(String[] args) {
        int[] arr = {9,7,5,4,1,88,6};
        String[] str = {"Java","ASCII","Python","Machine Learning","Data Science","Data Analytics"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
        
    }
}
