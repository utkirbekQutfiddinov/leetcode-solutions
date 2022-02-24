package solutions;

import java.util.Stack;

public class $0232 {
}
class MyQueue {
    Stack<Integer> main=new Stack<>();
    Stack<Integer> helper=new Stack<>();
    public MyQueue() {}
    public void push(int x) {
        main.push(x);
    }

    public int pop() {
        while(!main.empty()){
            helper.push(main.pop());
        }
        int res=helper.pop();
        while(!helper.empty()){
            main.push(helper.pop());
        }
        return res;
    }

    public int peek() {
        while(!main.empty()){
            helper.push(main.pop());
        }
        int res=helper.peek();
        while(!helper.empty()){
            main.push(helper.pop());
        }
        return res;
    }

    public boolean empty() {
        return main.empty();
    }
}
