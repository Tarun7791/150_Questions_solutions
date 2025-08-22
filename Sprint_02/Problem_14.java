package Sprint_02;
import java.util.Scanner;

public class Problem_14 {
    public static void main(String[] args) {

        Scanner kb=new Scanner(System.in);
        String st;
        System.out.println("Enter the string ");
        st=kb.next();

        boolean balanced=false;

        for(int i=0;i<st.length();i++){
            for(int j=st.length()-1;j>=0;j--){
                if(st.charAt(i)==st.charAt(j)){
                    balanced=true;
                }
            }
        }

        if(balanced){
            System.out.println("The brackets are balanced ");
        }
    }
}
