class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int[] res=new int[m*n];
        
        int r=0, c=0;
        int index=0;
        
        while(r<m && c<n && r>=0 && c>=0){
            while(r>=0 && c<n){
                res[index]=mat[r][c];
                index++;
                r--;
                c++;
            }
            
            if(r<0 && c<n){
                r++;
            } else if(r<0 && c>=n){
                r+=2;
                c--;
            }else if(c>=n && r<m){
                r+=2;
                c--;
            }
            
            while(r<m && c>=0){
                res[index]=mat[r][c];
                index++;
                r++;
                c--;
            }
            if(r>=m && c>=0){
                r--;
                c+=2;
            }else if(r>=m && c<0){
                r--;
                c+=2;
            }else if(c<0 && r<m){
                c++;
            }
        }
        return res;
    }
}