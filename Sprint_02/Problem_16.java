package Sprint_02;
public class Problem_16 {
    public static void main(String[] args) {

        int [] arr={100,4,200,1,3,2};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        int count=0;
        int n=1;

            for(int j=0;j<=arr.length-1;j++) {
                if(arr[j]==n){
                    System.out.print(arr[count]+" ");
                    count++;
                    n++;
            }
            }

        System.out.println("The longest substring is consist of "+count+" numbers");
        }
    }
