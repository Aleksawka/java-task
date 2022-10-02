package cz.acamar.tasks;

public class Task1 {

    /**
     * Task 1. Length of the last word.
     * <p>
     * Given a string s consisting of some words separated by some number of spaces,
     * return the length of the last word in the string.
     * <p>
     * A word is a maximal substring consisting of non-space characters only.
     * <p>
     * Example input: "Hello World"
     * Expected output: 5
     *
     * @param str - a string s consisting of some words separated by some number of spaces.
     * @return - the length of the last word in the string.
     */
    public int lengthOfLastWord(String str) {
        /*
          Check on null and one word string before processing
        */
        if (str == null) {
            return 0;
        }

        if (!str.contains(" ")) {
            return str.length();
        }

        /*
          Reverse for find last word
         */
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();
        String reversed = builder.toString();

        int length = 0;
        int lastLength =0;

        /*
          Iterate until find first word in reversed string
         */
        for (int i=0; i < reversed.length() && lastLength == 0; i++) {
            if (reversed.charAt(i) != ' ') {
                length = length +1;
            } else {
                if (length != 0) {
                    lastLength = length;
                }
            }
        }

        return lastLength;
    }
}
