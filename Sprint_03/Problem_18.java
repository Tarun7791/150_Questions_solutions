package Patterns_Problems_B;

public class Problem_18 {
    public static void main(String[] args) {

        int n=4;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){

            if(i==1 || i==n){
                System.out.print(j+" ");
            } else if (j==1 || j==n) {
                System.out.print("1 ");
            }
            else {
                System.out.print("  ");
            }


            }
            System.out.println();
        }

    }
}
