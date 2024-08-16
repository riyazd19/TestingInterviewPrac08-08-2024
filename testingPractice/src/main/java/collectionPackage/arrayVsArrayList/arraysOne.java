package collectionPackage.arrayVsArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arraysOne {
    public static void main(String[] args) {
        System.out.println("  hiii");
     //   String[] strArray= new String[4];
       String[] strArray1= {"stringOne","stringTwo","stringThree","stringFour"};
       List<String> li= new ArrayList<>(Arrays.asList(strArray1));
       System.out.println(li);

    }
}
