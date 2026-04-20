/*
Q12 Check if last index reachable.
*/
import java.util.*;
public class JumpGame {

    public static void main(String[] args) {

        int[] nums={2,3,1,1,4};

        System.out.println("Output: "+canJump(nums));
    }

    static boolean canJump(int[] nums){

        int max=0;

        for(int i=0;i<nums.length;i++){

            if(i>max) return false;

            max=Math.max(max,i+nums[i]);
        }
        return true;
    }
}