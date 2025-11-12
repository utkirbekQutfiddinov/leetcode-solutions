class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Integer, Integer> maps=new HashMap<>(), mapt=new HashMap<>();

        int sa,ta;
        for(int i=0; i<s.length(); i++){
            sa=s.charAt(i)-96;
            ta=t.charAt(i)-96;
            if(!maps.containsKey(sa)){
                maps.put(sa,ta);
            }else if(maps.get(sa)!=ta){
                return false;
            }

            if(!mapt.containsKey(ta)){
                mapt.put(ta,sa);
            }else if(mapt.get(ta)!=sa){
                return false;
            }
        }
        return true;
    }
}