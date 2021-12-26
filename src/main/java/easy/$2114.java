package easy;

public class $2114 {
    public int mostWordsFound(String[] sentences) {
        int len=0, maxLen=0;
        for(int i=0; i<sentences.length; i++){
            if(!sentences[i].equals("")) len=1;
            else len=0;
            for(int j=0; j<sentences[i].length(); j++)
                if(sentences[i].charAt(j)==' ') len++;
            if(len>maxLen) maxLen=len;
        }

        return maxLen;
    }
}
