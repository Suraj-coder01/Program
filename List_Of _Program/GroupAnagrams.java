/*
Q9 Group the anagrams together.
*/

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {

        String[] arr = {"eat","tea","tan","ate","nat","bat"};

        Map<String,List<String>> map = new HashMap<>();

        for (String s: arr) {

            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);

            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(s);
        }

        System.out.println("Output: " + map.values());
    }
}
