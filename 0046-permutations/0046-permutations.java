class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        getResult(res, new ArrayList<>(), new HashSet<>(), nums);
        return res;
    }

    private void getResult(List<List<Integer>> res, List<Integer> currList, Set<Integer> usedIndexes, int[] source){
            if(currList.size()==source.length)
            res.add(new ArrayList<>(currList));

            for(int i=0; i<source.length; i++){
                if(usedIndexes.contains(i)){
                    continue;
                }

                usedIndexes.add(i);
                currList.add(source[i]);
                getResult(res, currList, usedIndexes, source);
                usedIndexes.remove(i);
                currList.removeLast();
            }
    }
}