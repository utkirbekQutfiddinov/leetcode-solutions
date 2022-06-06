class Solution {
    public boolean rotateString(String s, String goal) {
        boolean teng=false;
        int slen=s.length();
        for(int i=0; i<slen; i++){
            if(s.equals(goal)) {
                teng=true; 
                break;
            }
            s=s.substring(1)+s.charAt(0);
            }
        return teng;
    }
}