package Sprint_02;
import java.util.Scanner;

public class Problem_02 {
    public static void main(String[] args) {

        Scanner kb=new Scanner(System.in);
        int start;
        System.out.println("Enter starting value ");
        start=kb.nextInt();
        int end;
        System.out.println("Enter ending value ");
        end=kb.nextInt();


        for(int i=start;i<=end;i++){
            for(int j=1;j<=end;j++){
                System.out.println(i+"*"+j+"="+(i*j));
            }
        }

    }
}
