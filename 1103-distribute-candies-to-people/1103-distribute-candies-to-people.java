class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int index=0, candy=1;
        int[] p=new int[num_people];
        while(candies>0){
            if(candies<=candy){
                p[index]+=candies;
                break;
            }else{
                p[index]+=candy;
                candies-=candy;
                candy++;
                index=(index+1)%num_people;
            }
        }
        return p;
    }
}