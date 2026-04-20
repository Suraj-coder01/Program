/*
Q3 Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the 
two sorted arrays.
The overall run time complexity should be O(log (m+n)).
Example 1:
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
Constraints:
nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106
*/
import java.util.*;
public class MedianArray {

    public static void main(String[] args) {

        // input arrays
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};

        // create merged array
        int[] merged = new int[nums1.length + nums2.length];

        int i = 0, j = 0, k = 0;

        // merge arrays
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j])
                merged[k++] = nums1[i++];
            else
                merged[k++] = nums2[j++];
        }

        // remaining elements
        while (i < nums1.length)
            merged[k++] = nums1[i++];

        while (j < nums2.length)
            merged[k++] = nums2[j++];

        // find median
        int n = merged.length;
        double median;

        if (n % 2 == 0)
            median = (merged[n/2 - 1] + merged[n/2]) / 2.0;
        else
            median = merged[n/2];

        // print result
        System.out.println("Output: " + median);
    }
}
