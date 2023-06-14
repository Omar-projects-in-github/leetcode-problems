package ArraysAndHashing;

public class ValidAnagramUsingAlphabetFrequency {
    public boolean isAnagram(String s, String t) {
        int sLength = s.length();
        if (sLength != t.length())
            return false;
        int[] letterFrequency = new int[26];
        for (int i = 0; i < sLength; i++) {
            letterFrequency[s.charAt(i) - 'a']++;
            letterFrequency[t.charAt(i) - 'a']--;
        }

        for (int frequency : letterFrequency) {
            if (frequency != 0)
                return false;
        }
        return true;
    }
}
