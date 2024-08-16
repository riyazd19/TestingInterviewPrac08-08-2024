package stringPackage;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args) {
        int a[]= {10,41,1,2,3,3,9,9,0,0};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println("space   "+a);

        //concate operation of string
        String s= "new String";
        System.out.println("   "+s);
        

        System.out.println(s.concat(" updated new string"));
    }
}
