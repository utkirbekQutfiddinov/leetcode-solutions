package solutions;

import java.util.Stack;

public class $0682 {
    public int calPoints(String[] ops) {
        Stack<Integer> stack=new Stack<>();
        for(short i=0; i<ops.length; i++){
            if(ops[i].equals("C")){
                stack.pop();
            } else if(ops[i].equals("D")){
                stack.push(stack.peek()*2);
            } else if(ops[i].equals("+")){
                int prev1=stack.pop();
                int prev2=stack.pop();
                stack.push(prev2);
                stack.push(prev1);
                stack.push(prev1+prev2);
            } else {
                stack.push(Integer.parseInt(ops[i]));
            }
        }
        int sum=0;
        while(!stack.empty()){
            sum+=stack.pop();
        }
        return sum;
    }
}
