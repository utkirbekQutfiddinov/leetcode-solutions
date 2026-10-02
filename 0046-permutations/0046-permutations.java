class Solution {
    public List<List<Integer>> permute(int[] nums) {
        return getResult(new ArrayList<>(), new HashSet<>(), nums);
    }

    private List<List<Integer>> getResult(List<Integer> currList, Set<Integer> usedIndexes, int[] source){
        List<List<Integer>> res=new ArrayList<>();

            if(currList.size()==source.length)
            res.add(new ArrayList<>(currList));

            for(int i=0; i<source.length; i++){
                if(usedIndexes.contains(i)){
                    continue;
                }

                usedIndexes.add(i);
                currList.add(source[i]);
                res.addAll(getResult(currList, usedIndexes, source));
                usedIndexes.remove(i);
                currList.removeLast();
            }

        return res;
    }
}