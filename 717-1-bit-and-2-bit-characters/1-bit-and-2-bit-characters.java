class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        boolean isOpen=false;
        int last=0;

        for(int i=0; i<bits.length-1; i++){
            if(bits[i]==1){
                if(isOpen)
                    isOpen=false;
                else 
                    isOpen=true;
            }else {
                if(isOpen){
                    isOpen=false;
                }
            }
            last=i;
        }
        return !isOpen && bits[bits.length-1]==0;
    }
}