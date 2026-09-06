class Solution {
    public int earliestTime(int[][] tasks) {
        int res=tasks[0][0]+tasks[0][1];
        for(int[] task: tasks){
            if(task[0]+task[1]<res){
                res=task[0]+task[1];
            }
        }
        return res;
    }
}