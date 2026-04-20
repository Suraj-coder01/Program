/*
Q2 Given a string s, return the longest palindromic substring in s.
Example 1:
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:
Input: s = "cbbd"
Output: "bb"
Constraints:
1 <= s.length <= 1000
s consist of only digits and English letters.
*/
import java.util.*;
public class LongestPalindrome {

    public static void main(String[] args) {

        // input string
        String s = "babad";

        // store result
        String ans = "";

        // check all substrings
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {

                // get substring
                String sub = s.substring(i, j + 1);

                // check palindrome
                if (isPalindrome(sub) && sub.length() > ans.length()) {
                    ans = sub;
                }
            }
        }

        // print result
        System.out.println("Output: " + ans);
    }

    // function to check palindrome
    static boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}