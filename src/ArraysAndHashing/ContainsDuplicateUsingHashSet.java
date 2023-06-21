package ArraysAndHashing;

import java.util.HashSet;
import java.util.Set;

/*
Leetcode exercise 217. Contains Duplicate
link to the problem: https://leetcode.com/problems/contains-duplicate/
difficulty: easy
 */

public class ContainsDuplicateUsingHashSet {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueValues = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (uniqueValues.contains(nums[i]))
                return true;
            else
                uniqueValues.add(nums[i]);
        }
        return false;
    }
}
