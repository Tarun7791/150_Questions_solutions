package Patterns_Problems_B;

public class Problem_30 {
    public static void main(String[] args) {

                int n = 5;

                for (int i = 0; i < n; i++) {

                    for (int s = 0; s < i; s++) {
                        System.out.print(" ");
                    }

                    for (int j = 0; j < n - i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }


                for (int i = 1; i < n; i++) {

                    for (int s = 0; s < n - i - 1; s++) {
                        System.out.print(" ");
                    }

                    for (int j = 0; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }
        }
















