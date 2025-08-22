package Patterns_Problems_B;

public class Problem_27 {
    public static void main(String[] args) {

        char ch='A';

        for(int i=0;i<3;i++){
            for(int j=1;j<=2*i+1;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
}
