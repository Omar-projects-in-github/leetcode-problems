package ArraysAndHashing;

import java.util.Arrays;

/*
Leetcode exercise 217. Contains Duplicate
link to the problem: https://leetcode.com/problems/contains-duplicate/
 */

public class ContainsDuplicateUsingSorting {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                return true;
        }
        return false;
    }
}
