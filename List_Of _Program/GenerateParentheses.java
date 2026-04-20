/*
Q6 Given n pairs of parentheses, write a function to generate all combinations of well-formed 
parentheses.
Example 1:
Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:
Input: n = 1
Output: ["()"]
Constraints:
1 <= n <= 8
*/

import java.util.*;

public class GenerateParentheses {

    public static void main(String[] args) {

        // input
        int n = 3;

        // store result
        List<String> result = new ArrayList<>();

        // generate parentheses
        generate("", 0, 0, n, result);

        // print result
        System.out.println("Output: " + result);
    }

    // recursive function
    static void generate(String str, int open, int close, int n, List<String> res) {

        // base condition
        if (str.length() == n * 2) {
            res.add(str);
            return;
        }

        // add '('
        if (open < n)
            generate(str + "(", open + 1, close, n, res);

        // add ')'
        if (close < open)
            generate(str + ")", open, close + 1, n, res);
    }
}
