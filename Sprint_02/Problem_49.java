package Sprint_02;

public class Problem_49 {
    public static void main(String[] args) {


        int[] arr={1,2,3,4,5,6};

        int sumodd=0;
        int sumeven=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                sumeven=sumeven+arr[i];
            }
            else{
                sumodd=sumodd+arr[i];
            }
        }

        int diff=sumeven-sumodd;

        System.out.println("Sum of even numbers "+sumeven);
        System.out.println("Sum of odd numbers "+sumodd);
        System.out.println("The difference between sum of even numbers and odd numbers are "+diff);

    }
}
