class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> row;


        List<List<Integer>> res=new ArrayList<>();
        res.add(List.of(1));

        for(int i=1; i<numRows; i++){
            row=new ArrayList<>();
            row.add(1);
            
            for(int j=1; j<i; j++){
                row.add(res.get(i-1).get(j)+res.get(i-1).get(j-1));
            }

            row.add(1);
            res.add(row);
        }
        return res;
    }
}