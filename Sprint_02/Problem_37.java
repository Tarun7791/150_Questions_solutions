package Sprint_02;
import java.util.Scanner;

public class Problem_37 {
    public static void main(String[] args) {

        Scanner kb=new Scanner(System.in);
        int num,value;
        System.out.println("Enter the number ");
        num=kb.nextInt();
        System.out.println("Enter the value ");
        value=kb.nextInt();


        int count=0;

        while(num!=0){
            int temp=num%10;
            if(temp>value){
                count++;
                System.out.print(temp+" ");
            }
            num=num/10;
        }

        System.out.println( );
        System.out.println("Numbers greater than "+value+" are "+count);

    }
}
