import java.util.*;

public class Day14 {

    public static int countSubstringsWithKDistinct(String s, int k) {
        if (k > s.length()) return 0;
        return atMostKDistinct(s, k) - atMostKDistinct(s, k - 1);
    }

    private static int atMostKDistinct(String s, int k) {
        if (k == 0) return 0;
        Map<Character, Integer> freq = new HashMap<>();
        int left = 0, result = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            freq.put(c, freq.getOrDefault(c, 0) + 1);

            while (freq.size() > k) {
                char leftChar = s.charAt(left);
                freq.put(leftChar, freq.get(leftChar) - 1);
                if (freq.get(leftChar) == 0) freq.remove(leftChar);
                left++;
            }

            result += right - left + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countSubstringsWithKDistinct("pqpqs", 2));
        System.out.println(countSubstringsWithKDistinct("a", 1));
        System.out.println(countSubstringsWithKDistinct("abc", 3));
        System.out.println(countSubstringsWithKDistinct("abc", 2));
    }
}
