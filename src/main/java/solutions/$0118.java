package solutions;

import java.util.ArrayList;
import java.util.List;

public class $0118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        List<Integer> prev;
        curr.add(1);
        res.add(curr);
        if(numRows==1) return res;
        curr=new ArrayList<Integer>();
        curr.add(1);
        curr.add(1);
        res.add(curr);
        if(numRows==2) return res;
        else
            for(int i=3; i<=numRows; i++){
                prev=curr;
                curr=new ArrayList<Integer>();
                curr.add(1);
                for(int j=1; j<=(i-2); j++){
                    curr.add(prev.get(j-1)+prev.get(j));
                }
                curr.add(1);
                res.add(curr);
            }

        return res;
    }
}
