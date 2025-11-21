class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occs=new HashMap<>();

        for(int i: arr){
            occs.put(i,occs.getOrDefault(i,0)+1);
        }

        Set<Integer> ocs=new HashSet<>();

        for(Integer i: occs.values()){
            if(ocs.contains(i)){
                return false;
            }
            ocs.add(i);
        }

        return true;

    }
}