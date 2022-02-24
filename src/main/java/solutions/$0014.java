package solutions;

public class $0014 {
    public static void main(String[] args) {
        String[] strs={"flower","flowers","flow","fligt"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        int minLenIndex=0;
        for(int i=0; i<strs.length; i++){
            if(strs[i].length()<strs[minLenIndex].length()) minLenIndex=i;
        }

        String prefix=strs[minLenIndex];

        for(int i=0; i<strs.length; i++){
            if(i!=minLenIndex) prefix=commonPrefix(prefix,strs[i]);
        }

        return prefix;

    }

    public static String commonPrefix(String str1,String str2){
        String mins="", maxs="";
        if(str1.length()>=str2.length()){
            mins=str2;
            maxs=str1;
        } else {
            mins=str1;
            maxs=str2;
        }
        for(int i=0; i<mins.length(); i++){
            if(mins.charAt(i)!=maxs.charAt(i)) return mins.substring(0,i);
        }
        return mins;
    }
}
