class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map=new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result=0, prev=1000, curr=0;

        for(int i=0; i<s.length(); i++){
            curr=map.get(s.charAt(i));
            if(curr>prev){
                result=result-2*prev+curr;
            }else {
                result=result+curr;
            }
            prev=curr;
        }
        
        return result;
    }
}