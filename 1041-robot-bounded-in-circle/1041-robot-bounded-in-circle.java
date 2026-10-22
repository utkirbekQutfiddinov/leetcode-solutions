class Solution {
    public boolean isRobotBounded(String instructions) {
        int dir1=0, dir2=0, x1=0, x2=0, y1=0, y2=0;

        for(char instr: instructions.toCharArray()){
            if(instr=='G'){
                if(dir2==0){
                    y2++;
                }else if(dir2==1){
                    x2++;
                }else if(dir2==2){
                    y2--;
                }else{
                    x2--;
                }
            }else if(instr=='R'){
                dir2=(dir2+1)%4;
            }else{
                dir2=(dir2-1+4)%4;
            }
        }
        if( !(x1!=x2 || y1!=y2)) return true;
        if(dir1!=dir2) return true;
        return false;
    }
}