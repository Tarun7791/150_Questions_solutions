package Sprint_02;

public class Problem_48 {
    public static void main(String[] args) {

        int [][] arr=new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=(int)(Math.random()*10);
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
