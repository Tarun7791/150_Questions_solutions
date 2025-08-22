package Sprint_02;

public class Problem_33 {
    public static void main(String[] args) {

    int[] arr={3,1,4,1,5};

    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]>=arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }

    int n=arr.length;

    if(n%2==0){
        int mid1=n/2-1;
        int mid2=n/2;
        int median=(arr[mid1]+arr[mid2])/2;
        System.out.println("Median is "+median);
    }

    else{
        int median=(n+1)/2;
        System.out.println("Median is "+arr[median-1]);
    }
    }
}
