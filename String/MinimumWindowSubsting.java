package String;

import java.util.Arrays;

class MinimumWindowSubstring {

    public static boolean containsAllCharacters(String s, String p) {
        int[] count = new int[256];
        Arrays.fill(count, 0);

        for (char ch : p.toCharArray())
            count[ch]++;

        for (char ch : s.toCharArray()) {
            if (count[ch] > 0)
                count[ch]--;
        }

        for (int c : count) {
            if (c > 0)
                return false;
        }

        return true;
    }

    public static String findSmallestSubstring(String s,
            String p) {
        int m = s.length();
        int n = p.length();
        String smallestSubstring = "";
        int minLen = Integer.MAX_VALUE;

        for (int i = 0; i < m; i++) {
            for (int j = i; j < m; j++) {
                String substr = s.substring(i, j + 1);

                if (containsAllCharacters(substr, p)) {
                    int currLen = substr.length();

                    if (currLen < minLen) {
                        minLen = currLen;
                        smallestSubstring = substr;
                    }
                }
            }
        }

        return smallestSubstring;
    }

    public static void main(String[] args) {
        String s = "timetopractice";
        String p = "toc";

        String result = findSmallestSubstring(s, p);

        if (!result.isEmpty()) {
            System.out.println(result);
        } else {
            System.out.println(-1);
        }
    }
}