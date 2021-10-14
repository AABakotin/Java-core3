package lessons6;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;



public class Method {

    private static final Logger logger = LogManager.getLogger(Method.class.getName());


    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] arr1 = {1, 5, 8, 4, 3, 2, 7, 7, 7};
        int[] arr2 = {2, 2, 3, 5, 2, 3, 6, 9, 7};



        System.out.println(fourOne(arr));
        System.out.println(fourOne(arr1));
        System.out.println(fourOne(arr2));
        System.out.println("*********************************");
        System.out.println(Arrays.toString(copyArr(arr)));
        System.out.println(Arrays.toString(copyArr(arr1)));
        System.out.println(Arrays.toString(copyArr(arr2)));
        System.out.println("*********************************");



    }

    public static int[] copyArr(int[] arr) {

            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] == 4) return Arrays.copyOfRange(arr, i + 1, arr.length);
            }
            logger.throwing(Level.ERROR, new RuntimeException("4 not found"));
        return arr;
    }


    public static boolean fourOne(int[] arr) {

        boolean four = false;
        boolean one = false;

        for (int j : arr) {
            if (j == 1) four = true;
            if (j == 4) one = true;
        }
        return one && four;
    }


}
