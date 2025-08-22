package Patterns_Problems_B;

public class Problem_26 {
    public static void main(String[] args) {

        for(int i=0;i<=3;i++){
            if(i%2==0){
                for(int j=0;j<=3;j++){
                    char ch='A';
                    char ch1='B';
                    if(j%2==0){
                        System.out.print(ch);
                    }
                    if (j%2!=0) {
                        System.out.print(ch1);
                    }
                }
                System.out.println();
            }
            if(i%2!=0){
                for(int j=0;j<=3;j++){
                    char ch='B';
                    char ch1='A';
                    if(j%2==0){
                        System.out.print(ch);
                    }
                    if (j%2!=0) {
                        System.out.print(ch1);
                    }
                }
                System.out.println();
            }
        }

    }
}
