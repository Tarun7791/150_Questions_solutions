package Patterns_Problems_B;

public class Problem_19 {
    public static void main(String[] args) {

        char ch=67;

        for(int i=1;i<=3;i++){
            for(int space=3;space>=3-i;space--){
                System.out.print(" ");
            }
            for(int j=3;j>=i;j--){
                System.out.print(ch);
            }
            ch--;
            System.out.println();
        }

    }
}
