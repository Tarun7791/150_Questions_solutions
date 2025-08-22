package Sprint_02;

public class Problem_34 {
    public static void main(String[] args) {

        String str="Hello world";
        String trimmed=str.trim();

        String[] words=trimmed.split("\\s+");

        System.out.println("No. of word "+words.length);
    }
}
