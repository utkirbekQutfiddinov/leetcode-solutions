package solutions;

public class $1381 {
}
class CustomStack {
    int[] elements;
    int count=0;
    public CustomStack(int maxSize) {
        elements=new int[maxSize];
    }

    public void push(int x) {
        if(count<elements.length)
            elements[count++]=x;
    }

    public int pop() {
        if(count>=1) return elements[--count];
        else return -1;
    }

    public void increment(int k, int val) {
        int lim=k>count?count:k;
        for(int i=0; i<lim; i++)
            elements[i]+=val;
    }
}
