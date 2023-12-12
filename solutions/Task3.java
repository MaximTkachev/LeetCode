package solutions;

public class Task3 {

    public int lengthOfLongestSubstring(String s) {
        String substring = "";
        int maxSubstringLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int k = substring.indexOf(ch);
            if (k == -1) {
                substring = substring + ch;
            } else {
                if (substring.length() > maxSubstringLength) {
                    maxSubstringLength = substring.length();
                }
                substring = substring.substring(k + 1) + ch;
            }
        }

        return Math.max(maxSubstringLength, substring.length());
    }
}
