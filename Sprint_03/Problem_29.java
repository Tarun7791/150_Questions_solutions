package Patterns_Problems_B;

public class Problem_29 {
    public static void main(String[] args) {

        int n=3;

        for(int i=1;i<=n;i++){
            for(int space=n-i;space>=1;space--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=i-1;j>=1;j--){
                System.out.print(j);
            }

            System.out.println();
        }

        for(int i=n-1;i>=1;i--){
            for(int space=n-i;space>=1;space--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=i-1;j>=1;j--){
                System.out.print(j);
            }

            System.out.println();
        }

    }
}
