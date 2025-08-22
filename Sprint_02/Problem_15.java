package Sprint_02;
public class Problem_15 {
    public static void main(String[] args) {

        String st="The numbers are 12 and 34 ";
        int sum=0;
        String num="";

        for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            if(ch>='0'&&ch<='9'){
                num=num+ch;
            }
            else{
                if(!num.isEmpty()){
                    sum=sum+Integer.parseInt(num);
                    num="";
                }

            }
        }

        if(!num.isEmpty()){
            sum=sum+Integer.parseInt(num);
        }


        System.out.println("The sum of the numbers are "+sum);
    }
}