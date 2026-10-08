class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        StringBuilder[] sbs=new StringBuilder[numRows];
        for(int i=0; i<numRows; i++){
            sbs[i]=new StringBuilder();
        }

        int ind=0;
        boolean down=true;
        for(int i=0; i<s.length(); i++){
            if(ind<0){
                ind=1;
                down=true;
            }
            if(ind>=numRows){
                ind=numRows-2;
                down=false;
            }
            sbs[ind].append(s.charAt(i));
            if(down) ind++;
            else ind--;
        }
        StringBuilder res=new StringBuilder();
        for(StringBuilder sb: sbs){
            res.append(sb);
        }
        return res.toString();
    }
}