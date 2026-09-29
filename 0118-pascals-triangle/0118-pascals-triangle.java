class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        res.add(List.of(1));

        if(numRows<2) return res;
        res.add(List.of(1,1));
        
            List<Integer> prevRow=List.of(1,1);

        for(int i=0; i<numRows-2; i++){
            List<Integer> currRow=new ArrayList<>();
            currRow.add(1);
            for(int j=1; j<=i+1; j++){
                currRow.add(prevRow.get(j-1)+prevRow.get(j));
            }
            currRow.add(1);
            res.add(currRow);
            prevRow=currRow;
        }
        return res;
    }
}