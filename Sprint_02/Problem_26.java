package Sprint_02;
import java.util.Scanner;

public class Problem_26 {
    public static void main(String[] args) {

        String st1="hello world hello";

        Scanner kb=new Scanner(System.in);
        String st2;
        System.out.println("Enter your word ");
        st2=kb.nextLine();

        int count=0;

        String[] words=st1.split(" ");
        // By this [] you can have multiple strings in one variable

        for(String word : words){
            if(word.equals(st2)){
                count++;
            }
        }
        System.out.println("The word appear "+count+" times");
    }
}
