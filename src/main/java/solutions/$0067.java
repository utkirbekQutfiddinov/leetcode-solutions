package solutions;

public class $0067 {
        public String addBinary(String a, String b) {
            if(a.equals("0")&&b.equals("0")) return "0";
            String s1,s2;
            int rem=0,sum=0;
            String res="";
            if(a.length()>b.length()){
                s1=b;
                s2=a;
            } else {
                s1=a;
                s2=b;
            }
            int diff=s2.length()-s1.length();
            for(int i=0; i<diff; i++)
                s1="0"+s1;

            for(int i=(s2.length()-1); i>=0; i--){
                sum=rem+(int)s2.charAt(i)+(int)s1.charAt(i)-96;
                res=(char)(sum%2+48)+res;
                rem=sum/2;
            }

            if(rem>0) res="1"+res;
            return res;
        }
    }
