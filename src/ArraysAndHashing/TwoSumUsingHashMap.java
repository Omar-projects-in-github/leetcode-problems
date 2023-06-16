package ArraysAndHashing;

import java.util.HashMap;
import java.util.Map;

/*
Leetcode exercise 1. Two Sum
link to the problem: https://leetcode.com/problems/two-sum/
*/

public class TwoSumUsingHashMap {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        if (length == 2)
            return new int[] {0, 1};

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            int requiredNumber = target - nums[i];
            if (map.containsKey(requiredNumber)) {
                System.gc();
                return new int[] {map.get(requiredNumber), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
