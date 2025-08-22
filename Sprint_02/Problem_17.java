package Sprint_02;

public class Problem_17 {
    public static void main(String[] args) {

        int [][] arr=new int[3][3];
        for(int i=0;i<1;i++){
            for(int j=0;j<3;j++){
                int a=j+1;
                arr[i][j]=a;

            }
        }

        int a=2;
        for(int k=0;k<3;k++){
            for(int l = 2; l == 2; l++){
                a++;
                arr[k][l]=a;
            }
        }

        int b = 4;
        for(int right=2;right>=0;right--){
            b = b + 1;
            arr[2][right] = b;
        }

        int c =6 ;
        for(int top=2;top>0;top--){
            c = c + 1;
            arr[top][0] = c;
        }
        int d=7;
        for(int left=0;left<=1;left++){
            d=d+1;
            arr[1][left]=d;
        }


        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
