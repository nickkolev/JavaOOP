package Inteview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>(Arrays.asList(5,6,5));

        System.out.println(findSingle(list));

    }

    public static int findSingle(List<Integer> list) {

        // [1, 2, 2, 1, 3]
        // [5, 6, 5]

        list.sort((e1, e2) -> e1.compareTo(e2));
        //5,5,6

        for (int i = 0; i < list.size() - 1; i+=2) {
            if(!list.get(i).equals(list.get(i + 1))) {
                return list.get(i);
            }
        }

        return list.get(list.size() - 1);
    }
}
