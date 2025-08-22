package Patterns_Problems_B;

public class Problem_40 {
    public static void main(String[] args) {

        int n=3;

        for(int i=0;i<3;i++){
            for(int space=n-i;space>=1;space--){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
