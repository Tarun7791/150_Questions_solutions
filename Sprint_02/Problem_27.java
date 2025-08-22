package Sprint_02;

public class Problem_27{
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n=arr.length;

        int max=0;

        for(int st=0;st<n;st++){
            int cursum=0;
            for(int end=st;end<n;end++){
                cursum=cursum+arr[end];
                max=Math.max(cursum,max);
            }

        }
        System.out.println(max);
    }
}


