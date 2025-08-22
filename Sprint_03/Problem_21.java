package Patterns_Problems_B;

public class Problem_21 {
    public static void main(String[] args) {

        int[][] arr = new int[3][3];

        int num = 1;

        for (int j = 0; j < 3; j++) {
            arr[0][j] = num;
            num++;
        }

        for (int i = 1; i < 3; i++) {
            arr[i][2] = num;
            num++;
        }

        for (int j = 1; j >= 0; j--) {
            arr[2][j] = num;
            num++;
        }

        arr[1][0] = num++;
        arr[1][1] = num;


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}


























