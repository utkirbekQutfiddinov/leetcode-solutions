class Solution {
    public void duplicateZeros(int[] arr) {
       Queue<Integer> que=new LinkedList<>();
       for(int i=0; i<arr.length; i++){
        if(arr[i]==0){
            que.add(0);
            que.add(0);
        }else{
            que.add(arr[i]);
        }
        Integer el=que.poll();
        arr[i]=el;
       }
    }
}