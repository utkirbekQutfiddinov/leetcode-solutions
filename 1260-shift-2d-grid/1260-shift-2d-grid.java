class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length, n=grid[0].length;
        
        //create one big long array of length m*n
        int[] one=new int[m*n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                one[i*n+j]=grid[i][j];
            }
        }
        
        //shift 1D array k times
        k=k%one.length;

for(int j=0; j<k; j++){
        int temp=one[one.length-1];
        for(int i=one.length-1; i>0; i--){
            one[i]=one[i-1];
        }
        one[0]=temp;
}

//make list from that single array
List<List<Integer>> result=new ArrayList<>();
List<Integer> row=new ArrayList<>();
for(int i=0; i<one.length; i++){
    if(i%n==0){
        row=new ArrayList<>();
    }
    row.add(one[i]);
    if(row.size()%n==0){
        result.add(row);
    }
}

        return result;
    }
}