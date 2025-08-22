package Sprint_02;
import java.util.Scanner;

public class Problem_10 {
    public static void main(String[] args) {

        Scanner kb=new Scanner(System.in);
        int limit;
        System.out.println("Enter limit ");
        limit=kb.nextInt();


        int count=0;

        for(int i=1;i<=limit;i++){
            int sum=0;
            for(int j=1;j<i;j++){
                if(i%j==0){
                    sum=sum+j;
                }
            }
            if(i==sum){
                count++;
                System.out.println(i+" ");
            }
        }

        System.out.println("There are "+count+" perfect numbers");

    }
}
