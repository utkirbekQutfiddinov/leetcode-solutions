package solutions;

public class $0739 {
    public int[] dailyTemperatures(int[] temperatures) {
        for(int i=0; i<temperatures.length; i++)
            temperatures[i]=nextGreaterTemp(temperatures,i);
        return temperatures;
    }

    int nextGreaterTemp(int[] temperatures, int d){
        if(d==(temperatures.length-1)) return 0;
        else {
            for(int i=(d+1); i<temperatures.length; i++)
                if(temperatures[i]>temperatures[d]){
                    return (i-d);
                }
            return 0;
        }
    }
}
