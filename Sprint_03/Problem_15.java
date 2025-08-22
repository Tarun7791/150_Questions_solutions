package Patterns_Problems_B;
public class Problem_15 {
    public static void main(String[] args) {

        int n=65;

        for(int i=1;i<=3;i++){
            char ch=(char)n++;
            for(int j=1;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
        }

    }
}
