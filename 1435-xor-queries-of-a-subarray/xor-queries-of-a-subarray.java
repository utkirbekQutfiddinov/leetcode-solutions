class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] answer=new int[queries.length];

        //answer[0]=11^2;

        for(int i=0; i<queries.length; i++){
            for(int j=queries[i][0]; j<=queries[i][1]; j++){
                answer[i]=answer[i]^arr[j];
            }
        }

        return answer;
    }
}