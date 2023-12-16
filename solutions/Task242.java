package solutions;

public class Task242 {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] store = new int[26];

        for (int i = 0; i < s.length(); i++) {
            store[toIndex(s.charAt(i))]++;
            store[toIndex(t.charAt(i))]--;
        }

        for (int i = 0; i < 26; i++) {
            if (store[i] != 0) {
                return false;
            }
        }

        return true;
    }

    private static int toIndex(char ch) {
        return ch - 'a';
    }
}
