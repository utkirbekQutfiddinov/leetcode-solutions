class Solution {
    public boolean canAliceWin(int n) {
        int count=10;
        boolean alice=true;

        while(true){
            if(count<0 || count>n) return !alice;
            n-=count;
            count--;
            alice=!alice; 
        }
    }
}