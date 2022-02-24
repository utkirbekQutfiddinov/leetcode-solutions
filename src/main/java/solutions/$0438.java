package solutions;

public class $0438 {
        public List<Integer> findAnagrams(String s, String p) {
            List<Integer> res=new ArrayList<>();
            int[] c2=new int[26];
            for(int i=0; i<p.length(); i++)
                c2[p.charAt(i)-97]++;
            for(int i=0; i<(s.length()-p.length()+1); i++)
                if(isAnagram(s.substring(i,i+p.length()),c2)) res.add(i);
            return res;
        }
        boolean isAnagram(String s1, int[] c2){
            int[] c1=new int[26];
            for(int i=0; i<s1.length(); i++)
                c1[s1.charAt(i)-97]++;
            for(int i=0; i<26; i++)
                if(c1[i]!=c2[i]) return false;
            return true;
        }
    }
