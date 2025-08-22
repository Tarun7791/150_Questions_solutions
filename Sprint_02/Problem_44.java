package Sprint_02;

public class Problem_44 {
    public static void main(String[] args) {

        String sr = "hello";
        int len = sr.length();

        for (int i = 0; i < len; i++) {
            char ch = sr.charAt(i);
            boolean alreadyCounted = false;

            // Check if this character was already counted
            for (int k = 0; k < i; k++) {
                if (sr.charAt(k) == ch) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) {
                continue; // Skip already counted characters
            }

            int count = 1; // Current character already counted once

            for (int j = i + 1; j < len; j++) {
                if (sr.charAt(j) == ch) {
                    count++;
                }
            }

            System.out.println(ch + " Frequency: " + count);
        }
    }
}
