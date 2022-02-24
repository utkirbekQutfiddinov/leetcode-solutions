package solutions;

import java.util.ArrayList;
import java.util.List;

public class $0500 {
        public String[] findWords(String[] words) {
            String qwer="qwertyuiop", asd="asdfghjkl",zxc="zxcvbnm";

            List<String> res=new ArrayList<>();
            for(int i=0; i<words.length; i++){
                if(canBeTyped(qwer,words[i])||canBeTyped(asd,words[i])||canBeTyped(zxc,words[i]))
                    res.add(words[i]);
            }

            String[] ans=new String[res.size()];
            for(int i=0; i<res.size(); i++)
                ans[i]=res.get(i);

            return ans;
        }

        boolean canBeTyped(String row, String s){
            boolean canBe=true;
            s=s.toLowerCase();
            for(int i=0; i<s.length(); i++)
                canBe=canBe&&row.indexOf(s.charAt(i))!=-1;
            return canBe;
        }
    }
