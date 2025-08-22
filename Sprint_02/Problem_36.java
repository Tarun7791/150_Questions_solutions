package Sprint_02;
import java.util.Scanner;

public class Problem_36 {
    public static void main(String[] args) {

        Scanner kb=new Scanner(System.in);
        int n;
        System.out.println("Enter the n number ");
        n=kb.nextInt();

        int sum=0;

       for(int i=2;i<=n*2;i++){
           if(i%2==0){
               System.out.print(i+" ");
               sum=sum+i;
           }
       }

        System.out.println("Sum of values are "+sum);

    }
}
