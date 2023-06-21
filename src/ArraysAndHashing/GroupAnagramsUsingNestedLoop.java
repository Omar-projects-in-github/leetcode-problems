package ArraysAndHashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Leetcode exercise 49. Group Anagrams
link to the problem: https://leetcode.com/problems/group-anagrams/
difficulty: medium
 */

public class GroupAnagramsUsingNestedLoop {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lists = new ArrayList<>();
        Set<String> hashSet = new HashSet<>();
        for (int i = 0; i < strs.length; i++) {
            List<String> tempList = new ArrayList<>();
            if (hashSet.contains(strs[i])) {
                continue;
            }
            tempList.add(strs[i]);
            for (int j = i + 1; j < strs.length; j++) {
                if (isAnagram(strs[i], strs[j])) {
                    tempList.add(strs[j]);
                    hashSet.add(strs[j]);
                }
            }
            lists.add(tempList);
        }
        return lists;
    }

    public boolean isAnagram(String str1, String str2) {
        int length = str1.length();
        if (length != str2.length())
            return false;

        int[] letterFrequency = new int[26];
        for (int i = 0; i < length; i++) {
            letterFrequency[str1.charAt(i) - 'a']++;
            letterFrequency[str2.charAt(i) - 'a']--;
        }

        for (int frequency : letterFrequency) {
            if (frequency != 0)
                return false;
        }
        return true;
    }
}
