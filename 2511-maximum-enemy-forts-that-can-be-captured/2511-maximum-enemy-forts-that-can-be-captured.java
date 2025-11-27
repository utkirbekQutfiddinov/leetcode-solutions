class Solution {
    public int captureForts(int[] forts) {
        int res=0, curr=0, j;

        for(int i=0; i<forts.length; i++){
            if(forts[i]==-1){
                System.out.println();
                System.out.print("-1 found at "+i);
                curr=0;
                for(j=i-1; j>0 && forts[j]==0; j--){
                    curr++;
                }
                System.out.print(", from i to 1 there is "+curr+" forts that can be captured in the left");
                if(j>=0 && forts[j]==1){
                    res=Math.max(res,curr);
                }
                
                System.out.println(", now the max is "+res);

                curr=0;
                for(j=i+1; j<forts.length-1 && forts[j]==0; j++){
                    curr++;
                }
                System.out.print("from i to 1 there is "+curr+" forts that can be captured in the right");
                if(j<forts.length && forts[j]==1){
                    res=Math.max(res,curr);
                }
                System.out.println(", now the max is "+res);
            }
        }

        return res;
    }
}