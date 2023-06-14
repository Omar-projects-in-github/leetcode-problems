package ArraysAndHashing;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagramUsingHashMap {
    public boolean isAnagram(String s, String t) {
        int sLength = s.length();
        if (sLength != t.length())
            return false;
        Map<Character, Integer> letterFrequency = new HashMap<>();

        for (char ch : s.toCharArray()) {
            if (letterFrequency.containsKey(ch))
                letterFrequency.put(ch, letterFrequency.get(ch) + 1);
            else
                letterFrequency.put(ch, 1);
        }

        for (char ch : t.toCharArray()) {
            if (letterFrequency.containsKey(ch)) {
                letterFrequency.put(ch, letterFrequency.get(ch) - 1);
                if (letterFrequency.get(ch) == 0)
                    letterFrequency.remove(ch);
            }
        }

        return letterFrequency.isEmpty();
    }
}
