package solutions;

public class Task8 {

    public int myAtoi(String s) {
        if (s.isBlank()) {
            return 0;
        }

        int sign = 1;
        int res = 0;

        s = s.trim();

        if (s.startsWith("-")) {
            sign = -1;
        }
        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            s = s.substring(1);
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!Character.isDigit(ch)) {
                return sign * res;
            }
            if (res > 0 && (Integer.MAX_VALUE - Character.getNumericValue(ch)) / res < 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = 10 * res + Character.getNumericValue(ch);
        }

        return sign * res;
    }
}
