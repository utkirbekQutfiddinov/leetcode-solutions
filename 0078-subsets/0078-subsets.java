class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        res.add(list);
        for(int i=0; i<nums.length; i++){
            getResult(res, list, i, nums);
        }
        return res;
    }

    
    private void getResult(List<List<Integer>> res, List<Integer> list, int from, int[] source){
        if(from>=source.length){
            return;
        }
        list.add(source[from]);
        res.add(new ArrayList<>(list));
        for(int i=from+1; i<source.length; i++){
            getResult(res, list, i, source);
        }
        list.remove(Integer.valueOf(source[from]));
    }
}