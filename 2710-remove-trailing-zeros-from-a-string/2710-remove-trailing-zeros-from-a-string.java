class Solution {
    public String removeTrailingZeros(String num) {
      int index=0;
        
        for(int i=num.length()-1; i>=0; i--){
            if(num.charAt(i)!='0'){
                index=i;
                break;
            }
        }
        
        return num.substring(0,index+1);
        
    }
}