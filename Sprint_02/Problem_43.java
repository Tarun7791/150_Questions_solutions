package Sprint_02;

public class Problem_43 {
        // Function to check if two strings are anagrams
        public static boolean areAnagrams (String s1, String s2){
            if (s1.length() != s2.length()) return false;

            char[] a = s1.toCharArray();
            char[] b = s2.toCharArray();

            // Sort both character arrays
            for (int i = 0; i < a.length - 1; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] > a[j]) {
                        char temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                    if (b[i] > b[j]) {
                        char temp = b[i];
                        b[i] = b[j];
                        b[j] = temp;
                    }
                }
            }

            // Compare sorted arrays
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    return false;
                }
            }

            return true;
        }

        public static void main (String[]args){
            String[] input = {"listen", "silent", "hello", "world"};
            int n = input.length;

            System.out.println("Anagram Pairs:");
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (areAnagrams(input[i], input[j])) {
                        System.out.println("[" + input[i] + ", " + input[j] + "]");
                    }
                }
            }

        }
    }
