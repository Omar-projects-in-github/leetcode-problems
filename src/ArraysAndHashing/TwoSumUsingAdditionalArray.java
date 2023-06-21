package ArraysAndHashing;

import java.util.Arrays;

/*
Leetcode exercise 1. Two Sum
link to the problem: https://leetcode.com/problems/two-sum/
difficulty: easy
*/

public class TwoSumUsingAdditionalArray {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        if (length == 2)
            return new int[] {0, 1};
        int startingIndex = 0, endingIndex = length - 1;
        int[] sortedArray = new int[length];
        for (int i = 0; i < length; i++) {
            sortedArray[i] = nums[i];
        }
        Arrays.sort(sortedArray);

        while (true) {
            if (sortedArray[startingIndex] +
                    sortedArray[endingIndex] < target)
                startingIndex++;
            else if (sortedArray[startingIndex] +
                    sortedArray[endingIndex] > target)
                endingIndex--;
            else if (sortedArray[startingIndex] +
                    sortedArray[endingIndex] == target)
                break;
        }

        int count = 0;
        boolean startingIndexChecked = false,
                endingIndexChecked = false;
        for (int i = 0; i < length; i++) {
            if (count == 2)
                break;
            if (nums[i] == sortedArray[startingIndex]
                    && !startingIndexChecked) {
                startingIndex = i;
                startingIndexChecked = true;
                count++;
            }
            else if (nums[i] == sortedArray[endingIndex]
                    && !endingIndexChecked) {
                endingIndex = i;
                endingIndexChecked = true;
                count++;
            }
        }
        return new int[] {startingIndex, endingIndex};
    }
}
