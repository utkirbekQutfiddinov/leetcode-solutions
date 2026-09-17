class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        List<int[]> list=new ArrayList<>();
        int l=0, r=-1;
        int sum=0;
        int res=Integer.MAX_VALUE;
        
        while(r<arr.length-1){
            if(sum<target){
                r++;
                sum+=arr[r];
            }else if(sum==target){
                list.add(new int[]{l,r});
                sum-=arr[l];
                l++;
            }else {
                sum-=arr[l];
                l++;
            }
        }

        while(sum>target){
            sum-=arr[l];
            l++;
        }

        if(sum==target){
            list.add(new int[]{l,r});
        }

        for(int[] pair: list){
            System.out.println(Arrays.toString(pair));
        }

        if(list.size()<2) return -1;


        l=0;
        r=1;
        int[] left=list.get(l), right=list.get(r);

        while(right[0]<=left[1]){
            r++;
            if(r==list.size()) break;
            right=list.get(r);
        }
        
        System.out.println("Starting pairs:"+Arrays.toString(left)+":"+Arrays.toString(right));
        System.out.println();

        if(right[0]<=left[1]) return -1;
        
        res=Math.min(res, right[1]-right[0]+1+left[1]-left[0]+1);

        int minInd=l;
        int[] min=left;

        while(r<list.size()){
            right=list.get(r);
            while(l<r && left[1]<right[0]){
                l++;
                left=list.get(l);

                if(left[1]>=right[0]){
                    l--;
                    break;
                }

                if(left[1]-left[0]<min[1]-min[0]){
                    minInd=l;
                    min=left;
                }
            }
            res=Math.min(res, right[1]-right[0]+1+min[1]-min[0]+1);
            r++;
        }

       return res==Integer.MAX_VALUE?-1:res;
    }
}