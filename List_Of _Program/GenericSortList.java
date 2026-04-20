// Q57: Generic method to sort list of Comparable elements

import java.util.*;

class GenericSortList {

    // generic method with Comparable constraint
    public static <T extends Comparable<T>> List<T> sortList(List<T> list) {

        Collections.sort(list); // built-in sorting
        return list;
    }

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(5, 2, 9, 1);
        List<String> names = Arrays.asList("Zara", "Aman", "Ravi");

        System.out.println(sortList(nums));
        System.out.println(sortList(names));
    }
}