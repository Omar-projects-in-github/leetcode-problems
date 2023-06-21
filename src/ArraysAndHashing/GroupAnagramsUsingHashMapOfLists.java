package ArraysAndHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/*
Leetcode exercise 49. Group Anagrams
link to the problem: https://leetcode.com/problems/group-anagrams/
difficulty: medium
 */

public class GroupAnagramsUsingHashMapOfLists {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> listsOfAnagrams = new ArrayList<>();
        if (strs.length == 0)
            return listsOfAnagrams;

        Map<String, List<String>> anagrams = new HashMap<>();
        for (String eachString : strs) {
            int[] letterFrequency = new int[26];
            for (char character : eachString.toCharArray()) {
                letterFrequency[character - 'a']++;
            }
            String key = new String(Arrays.toString(letterFrequency));
            anagrams.computeIfAbsent(key, k -> new ArrayList<>());
            anagrams.get(key).add(eachString);
        }
        listsOfAnagrams.addAll(anagrams.values());
        return listsOfAnagrams;
    }
}
