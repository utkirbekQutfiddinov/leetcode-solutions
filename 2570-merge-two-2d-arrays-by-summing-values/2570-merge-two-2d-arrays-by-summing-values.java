class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int[] ids=new int[1001];
        Set<Integer> c=new HashSet<>();

        for(int i=0; i<nums1.length; i++){
            ids[nums1[i][0]]+=nums1[i][1];
            c.add(nums1[i][0]);
        }

        for(int i=0; i<nums2.length; i++){
            ids[nums2[i][0]]+=nums2[i][1];
            c.add(nums2[i][0]);
        }

        int[][] res=new int[c.size()][2];
        int ind=0;
        for(int i=0; i<ids.length; i++){
            if(ids[i]!=0){
                res[ind][0]=i;
                res[ind][1]=ids[i];
                ind++;
            }
        }

        return res;
    }
}