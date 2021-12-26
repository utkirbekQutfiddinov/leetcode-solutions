package easy;

public class $0028 {
    public int strStr(String haystack, String needle) {
        for(int i=0; i<haystack.length(); i++)
            if(haystack.substring(i).startsWith(needle))
                return i;
        return -1;
    }
}
