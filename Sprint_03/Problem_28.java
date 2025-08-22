package Patterns_Problems_B;

public class Problem_28 {
    public static void main(String[] args) {

        int n=5;
        char ch='A';

        for(int i=0;i<n;i++) {
            System.out.print(ch);

            if (i > 0) {
                for (int space = 0; space < 2 * i - 1; space++){
                    System.out.print(" ");
                }
                System.out.print(ch);
            }

            ch++;
            System.out.println();

        }
    }
}
