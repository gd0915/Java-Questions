package questions;

import java.util.HashMap;

public class Q45 {


    public static void main(String[] args) {

        //Type a code  to find the duplicate values of an array of integer values.


//            for (int i = 0; i < arr.length; i++) {
//
//                for (int k = i + 1; k < arr.length; k++) {
//
//                    if (arr[i] == (arr[k])) {
//
//                        System.out.print(arr[i] + " ");
//                    }
//                }
//            }

        Integer[] arr = {10, 12, 14, 23, 46, 52, 12, 10, 67};
        HashMap<Integer, Integer> counter = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int counter1 = 1;
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[i] == (arr[k])) {
                    counter1++;
                    counter.put(arr[i], counter1);
                }

            }

        }
        System.out.println(counter);
    }
}