package solutions.easy;

public class Task58 {

    public int lengthOfLastWord(String s) {
        int index = s.length() - 1;
        while (s.charAt(index) == ' ')
            index--;

        int counter = 0;
        while (index >= 0 && s.charAt(index) != ' ') {
            index--;
            counter++;
        }

        return counter;
    }
}
