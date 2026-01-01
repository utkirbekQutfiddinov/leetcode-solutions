class Solution {
    public int[] plusOne(int[] digits) {
        int qoldiq=1, son;
        LinkedList<Integer> l=new LinkedList<>();
        
        for(int i=digits.length-1; i>=0; i--){
            son=digits[i]+qoldiq;
            l.add(son%10);
            qoldiq=son/10;
        }
        
        if(qoldiq>0){
            l.add(qoldiq);
        }
        
        int[] res=new int[l.size()];
        
        for(int i=0; i<l.size(); i++){
            res[i]=l.get(l.size()-i-1);
        }
        
        return res;
    }
}