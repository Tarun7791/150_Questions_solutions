package Sprint_02;

import java.util.Scanner;

public class Problem_28 {
    public static void main(String[] args) {

        Scanner kb=new Scanner(System.in);
        int n;
        System.out.println("Enter number of rows ");
        n=kb.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
