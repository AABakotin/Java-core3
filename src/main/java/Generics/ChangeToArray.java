package Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class ChangeToArray {

    public static ArrayList<Object> toArray(Object[] arr) {

        return new ArrayList<>(Arrays.asList(arr));   //Идея сама преобразовала в одну строчку

        //      ArrayList<Object> arrayList = new ArrayList<>(Arrays.asList(arr));
        //       return arrayList;




    }
}
