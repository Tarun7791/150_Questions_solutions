package Sprint_02;

public class Problem_30 {
    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 1, 1, 1};
        int count = 0;
        int maxcount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                maxcount = Math.max(count, maxcount);
            } else {
                count = 0;
            }
        }

        System.out.println("The longest sequence of consecutive 1s is "+maxcount);
    }
}
