package Sprint_02;
import java.util.Scanner;

public class Problem_04 {
    public static void main(String[] args) {

        Scanner kb=new Scanner(System.in);
        int target;
        System.out.println("Enter target ");
        target=kb.nextInt();

        int []arr={1,2,3,4,5};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                int temp=arr[i]+arr[j];
                if(temp==target){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }

    }
}
