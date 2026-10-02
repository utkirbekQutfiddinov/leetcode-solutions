class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        getResult(res, new ArrayList<>(), new boolean[nums.length], nums);
        return res;
    }

    private void getResult(List<List<Integer>> res, List<Integer> currList, boolean[] used, int[] source){
            if(currList.size()==source.length)
            res.add(new ArrayList<>(currList));

            for(int i=0; i<source.length; i++){
                if(used[i]){
                    continue;
                }

                used[i]=true;
                currList.add(source[i]);
                getResult(res, currList, used, source);
                used[i]=false;
                currList.removeLast();
            }
    }
}