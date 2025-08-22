package Patterns_Problems_B;

public class Problem_20 {
    public static void main(String[] args) {

        int n=5;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=3;j++){

                if(i==1||i==5){
                    System.out.print("*"+" ");
                } else if (j==3) {
                    System.out.print("*"+" ");
                }

                else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

    }
}
