package solutions;

public class $0171 {
        public int titleToNumber(String columnTitle) {
            int result=0;
            int res=0;
            for(int i=0;i<columnTitle.length();i++)
            {
                result=(columnTitle.charAt(i)-'A')+1;
                res=res+result*(int)Math.pow(26,columnTitle.length()-i-1);
            }
            return res;
        }
    }
