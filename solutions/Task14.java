package solutions;

public class Task14 {

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        int minLength = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            int length = strs[i].length();
            if (length < minLength) {
                minLength = length;
            }
        }

        for (int i = 0; i < minLength; i++) {
            char ch = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != ch) {
                    return prefix.toString();
                }
            }
            prefix.append(ch);
        }

        return prefix.toString();
    }
}
