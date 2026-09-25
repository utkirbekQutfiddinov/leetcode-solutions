class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res=new ArrayList<>();
        int start=0, end=0;

        while(end<s.length()){
            if(s.charAt(end)==s.charAt(start)){
                end++;
            }else {
                if(end-start>=3)
                res.add(List.of(start, end-1));
                start=end;
            }
        }

        
                if(end-start>=3)
                res.add(List.of(start, end-1));
        return res;
    }
}