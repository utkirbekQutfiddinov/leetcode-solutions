class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int lineCount=0, prevLine=0, currLine=0;
        
        int i=0;
        while(i<s.length()){
            char c=s.charAt(i);
            if(currLine+widths[c-'a']>100){
                prevLine=currLine;
                currLine=0;
                lineCount++;
            }else{
                currLine+=widths[c-'a'];
                i++;
            }
        }

        if(currLine>0){
            lineCount++;
            prevLine=currLine;
        }

        return new int[]{lineCount, prevLine};
    }
}