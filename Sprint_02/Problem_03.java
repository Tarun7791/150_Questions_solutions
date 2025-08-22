package Sprint_02;
import java.util.Scanner;

public class Problem_03 {
    public static void main(String[] args) {

        Scanner kb=new Scanner(System.in);
        int num;
        System.out.println("Enter nth term ");
        num=kb.nextInt();

        float st=0;

        for(int i=1;i<=num;i++){

             st=st+(1.0f/i);


        }

        System.out.println("The sum of the series is "+st);

    }
}
