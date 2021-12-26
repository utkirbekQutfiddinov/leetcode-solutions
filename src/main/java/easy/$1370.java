package easy;

public class $1370 {
    public String sortString(String s) {

        //occurNum[97]=2 means 'a' => string s have 2 'a' characters

        int[] occurNum=new int[123];
        int charNum=0;
        //calculating occurences of every character in the string
        for(int i=0; i<s.length(); i++){
            occurNum[(int)s.charAt(i)]++;}

        String result="";

        int num=0;

        while(num<s.length()){
            for(char i='a'; i<='z'; i++){
                // occurNum[(int)'a']=> occurNum[97] => 2 we have 2 'a's in our s string
                if(occurNum[(int)i]>0){
                    //res+='a'
                    result+=i;
                    //occurNum[97]--; remains one 'a'
                    occurNum[(int)i]--;
                }
            }

            for(char i='z'; i>='a'; i--){
                if(occurNum[(int)i]>0){
                    result+=i;
                    occurNum[(int)i]--;
                }
            }

            num++;
        }
        return result;
    }
}
