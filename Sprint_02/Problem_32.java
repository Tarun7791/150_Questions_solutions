package Sprint_02;
public class Problem_32 {
    public static void main(String[] args) {

        String str="abab";
        boolean isRepeated=false;

        for(int i=1;i<=str.length()/2;i++) {
            String part = str.substring(0, i);
            String repeated = "";

            while (repeated.length() < str.length()) {
                repeated = repeated + part;
            }

            if (repeated.equals(str)) {
                isRepeated = true;
                break;
            }
        }

        System.out.println("Output is "+isRepeated);

        }
    }

