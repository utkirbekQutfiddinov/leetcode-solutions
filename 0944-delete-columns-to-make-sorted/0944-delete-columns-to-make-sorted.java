class Solution {
    public int minDeletionSize(String[] strs) {
        Set<Integer> deleted=new HashSet<>();

        for(int i=1; i<strs.length; i++){
            for(int j=0; j<strs[i].length(); j++){
                if(deleted.contains(j)){
                    continue;
                }
                if(strs[i].charAt(j)<strs[i-1].charAt(j)){
                    deleted.add(j);
                    continue;
                }
            }
        }
        return deleted.size();
    }
}