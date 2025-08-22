package Sprint_02;

public class Problem_06 {
    public static boolean isPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static int countSubstrings(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String sub = str.substring(i, j); // Get substring from i to j-1
                if (isPalindrome(sub)) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "aaa";
        System.out.println("Total palindromic substrings: " + countSubstrings(str));
}
}
