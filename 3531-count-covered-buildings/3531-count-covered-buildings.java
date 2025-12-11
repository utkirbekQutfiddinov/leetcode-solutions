class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        Map<Integer, Integer> yleft=new HashMap<>(),
                            yright=new HashMap<>(),
                            xtop=new HashMap<>(),
                            xbottom=new HashMap<>();

        for(int[] building: buildings){
            xtop.merge(building[0], building[1], Math::max);
            xbottom.merge(building[0], building[1], Math::min);
            yleft.merge(building[1], building[0], Math::min);
            yright.merge(building[1], building[0], Math::max);
        }

        int top,bottom,left,right,x,y;
        int count=0;
        for(int[] building: buildings){
            x=building[0];
            y=building[1];
            top=xtop.get(x);
            bottom=xbottom.get(x);
            left=yleft.get(y);
            right=yright.get(y);

            if(x>left && x<right && y<top && y>bottom){
                count++;
            }
        }

        return count;
    }
}