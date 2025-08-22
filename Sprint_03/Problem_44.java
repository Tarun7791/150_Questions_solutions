package Patterns_Problems_B;

public class Problem_44 {
    public static void main(String[] args) {

        int n=3;
        int no=1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(no);
                no++;
            }
            System.out.println();
        }

    }
}
