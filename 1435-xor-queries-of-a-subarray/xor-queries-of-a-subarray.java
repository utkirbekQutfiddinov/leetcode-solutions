class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
       int[] p=new int[arr.length];

        p[0]=arr[0];

       for(int i=1; i<arr.length; i++){
        p[i]=p[i-1]^arr[i];
       }


       int[] answer=new int[queries.length];

       for(int i=0; i<queries.length; i++){
        if(queries[i][0]>0){
            answer[i]=p[queries[i][1]]^p[queries[i][0]-1];
        }else {
            answer[i]=p[queries[i][1]];
        }
       }

        return answer;
    }
}