class Solution {
    public String frequencySort(String s) {
        int[] c=new int[63];
        
        for(int i=0; i<s.length(); i++){
            if(Character.isUpperCase(s.charAt(i))){
                c[27+(int)s.charAt(i)-65]++;
            }else if(Character.isLowerCase(s.charAt(i))) {
                c[(int)s.charAt(i)-97]++;
            }else {
                //digits
                c[53+(int)s.charAt(i)-48]++;
            }
        }
        
        
        StringBuilder sb=new StringBuilder();
        
        int maxIndex=findMax(c);
        int count=0;
        
        while(c[maxIndex]!=0){
            count=c[maxIndex];
            c[maxIndex]=0;
            
            if(maxIndex<27){
                
              for(int i=0; i<count; i++){
                sb.append((char)(maxIndex+97));
            }  
                
            }else if(maxIndex<53) {
            for(int i=0; i<count; i++){
                sb.append((char)(maxIndex+65-27));
            }
            }else {
            for(int i=0; i<count; i++){
                sb.append((char)(maxIndex+48-53));
            }
                
            }
            
            maxIndex=findMax(c);
        }
        
        return sb.toString();
        
    }
    
    private int findMax(int[] a){
        int res=0;
        
        
        for(int i=0; i<a.length; i++){
            if(a[res]<a[i]) res=i;
        }
        
        return res;
        
    }
}