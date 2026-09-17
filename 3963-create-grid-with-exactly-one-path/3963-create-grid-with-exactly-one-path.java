class Solution {
    public String[] createGrid(int m, int n) {
        String[] rows=new String[m];
        for(int i=0; i<m; i++){
            StringBuilder sb=new StringBuilder();
            char c='#';
            if(i==0) c='.';
            for(int j=0; j<n-1; j++){
                sb.append(c);
            }
            sb.append('.');
            rows[i]=sb.toString();
        }
        return rows;
    }
}