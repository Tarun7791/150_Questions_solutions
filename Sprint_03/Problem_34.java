package Patterns_Problems_B;

public class Problem_34 {
    public static void main(String[] args) {

        int n=3;
        int chn=65;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                char ch=(char)chn;
                System.out.print(ch);
                chn++;
            }
            System.out.println();
        }

    }
}
