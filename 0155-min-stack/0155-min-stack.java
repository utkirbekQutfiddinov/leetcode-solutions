class MinStack {
    private int index;
    private int minIndex;
    private int[] stack;
    private int[] minIndexes;

    public MinStack() {
        index=0;
        stack=new int[30000];
        minIndex=0;
        minIndexes=new int[30000];
    }
    
    public void push(int val) {
        stack[index]=val;
        index++;

        if(minIndex==0){
            minIndexes[minIndex]=val;
        }else {
            if(val<=minIndexes[minIndex-1]){
                minIndexes[minIndex]=val;
            }else {
                minIndexes[minIndex]=minIndexes[minIndex-1];
            }
        }
        minIndex++;
    }
    
    public void pop() {
        index--;
        minIndex--;
    }
    
    public int top() {
        return stack[index-1];
    }
    
    public int getMin() {
        return minIndexes[minIndex-1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */