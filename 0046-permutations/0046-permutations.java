class Solution {
    public List<List<Integer>> permute(int[] nums) {
        return getResult(new ArrayList<>(), new HashSet<>(), nums);
    }

    private List<List<Integer>> getResult(List<Integer> currList, Set<Integer> usedIndexes, int[] source){
        List<List<Integer>> res=new ArrayList<>();

            if(currList.size()==source.length)
            res.add(currList);

            Set<Integer> newSet;
            List<Integer> newList;
            for(int i=0; i<source.length; i++){
                if(usedIndexes.contains(i)){
                    continue;
                }

                newSet=new HashSet<>(usedIndexes);
                newSet.add(i);

                newList=new ArrayList<>(currList);
                newList.add(source[i]);

            res.addAll(getResult(newList, newSet, source));
        }

        return res;
    }
}