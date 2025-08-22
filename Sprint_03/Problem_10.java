package Patterns_Problems_B;

public class Problem_10 {
    public static void main(String[] args) {

        int n=3;

        for(int i=1;i<=n;i++){

            for(int space=1;space<=n-i;space++){
                System.out.print("  ");
            }

            int num=i;
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }

            num=num-2;
            for(int j=1;j<i;j++){
                System.out.print(num+" ");
                num--;
            }


            System.out.println();

        }

    }
}
