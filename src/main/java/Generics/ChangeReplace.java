package Generics;

import java.util.Arrays;

public class ChangeReplace {


    public static void changeArr(int firstValues, int secondValues, Object[] arr) {

        Object treeValue = arr[firstValues];
        arr[firstValues] = arr[secondValues];
        arr[secondValues] = treeValue;
        System.out.println(Arrays.toString(arr));



    }

}
