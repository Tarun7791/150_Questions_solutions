package Sprint_02;

public class Problem_46 {
    public static void main(String[] args) {

        String str = "I am learning Java programming";
        str = str + " ";
        int maxLen = 0;
        int currLen = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                currLen++;
            } else {
                if (currLen > maxLen) {
                    maxLen = currLen;
                }
                currLen = 0;
            }
        }

        System.out.println("Length of the longest word: " + maxLen);

    }
}
