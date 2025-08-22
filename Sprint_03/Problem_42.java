package Patterns_Problems_B;

public class Problem_42 {
    public static void main(String[] args) {

    char [][] arr=new char[3][4];

    for(int i=0;i<=2;i++){
        for(int j=0;j<=3;j++){

            if((i+j)%2==0){
                arr[i][j]='A';
            }
            else{
                arr[i][j]='B';
            }
        }
    }

    for(int i=0;i<=2;i++){
        for(int j=0;j<=3;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }

    }
}
