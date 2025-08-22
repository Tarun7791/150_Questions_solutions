package Patterns_Problems_B;

public class Problem_17 {
    public static void main(String[] args) {

        int n=3;

        for(int i=0;i<n;i++){
            for(int space=1;space<n-i;space++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
