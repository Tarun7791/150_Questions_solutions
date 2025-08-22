package Patterns_Problems_B;

public class Problem_09 {
    public static void main(String[] args) {


        int n=4;
        int num=1;

        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }

    }
}
