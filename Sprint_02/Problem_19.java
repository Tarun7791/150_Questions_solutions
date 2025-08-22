package Sprint_02;
import java.util.Scanner;

public class Problem_19 {
    public static void main(String[] args) {

        Scanner kb=new Scanner(System.in);
        int start,end;
        System.out.println("Enter starting value");
        start=kb.nextInt();
        System.out.println("Enter ending value ");
        end=kb.nextInt();

        System.out.println("Perfect squares between 1 and 10 are "+" ");

        for(int i=start;i<=end;i++){
            for(int j=1;j<=end;j++){
                int k=(int)Math.pow(i,2);
                if(k==j){
                    System.out.print(j+" ");
                }
            }
        }
    }
}
