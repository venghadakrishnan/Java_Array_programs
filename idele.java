import java.util.Scanner;

public class idele {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int ele = 1;
        int index = -1; //were is the element is not in the array it returns -1
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==ele){
                index = i;
                break;
            }
        }
        System.out.println("index of "+ele+" is: "+index);
    }
}

// USING ArryaUtils

// instead of int index we have to write " int index = ArryaUtils.indexof(arr,ele); "

    // to find the index of the given element::
    // public static void main(String[] args){
    //     int[] a = new int[]{1,2,3,4,5,6,7,8,9,10};

    //     // System.out.println("Our array"+a);

    //     Scanner b = new Scanner(System.in);
    //     int u = b.nextInt();

    //     for(int i = 0;i<a.length;i++){
    //         if(a[i]==u)
    //             System.out.println("Index of element in the array"+i);
    //     }
        
    // }



