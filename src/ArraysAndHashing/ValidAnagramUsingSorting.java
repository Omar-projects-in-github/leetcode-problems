package ArraysAndHashing;

import java.util.Arrays;

public class ValidAnagramUsingSorting {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        char[] arrayOfS = s.toCharArray();
        char[] arrayOfT = t.toCharArray();
        Arrays.sort(arrayOfS);
        Arrays.sort(arrayOfT);
        for (int i = 0; i < arrayOfS.length; i++) {
            if (arrayOfS[i] != arrayOfT[i])
                return false;
        }
        return true;
    }
}
