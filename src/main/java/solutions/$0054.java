package solutions;

import java.util.ArrayList;
import java.util.List;

public class $0054 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res=new ArrayList<>();
        int top=0, bottom=matrix.length-1, left=0, right=matrix[0].length-1;
        int len=matrix.length*matrix[0].length;

        while(true){
            for(int i=left; i<=right; i++){
                res.add(matrix[top][i]);
            }
            top++;
            if(top>bottom) break;

            for(int i=top; i<=bottom; i++){
                res.add(matrix[i][right]);
            }
            right--;
            if(left>right) break;

            for(int i=right; i>=left; i--){
                res.add(matrix[bottom][i]);
            }
            bottom--;
            if(bottom<top) break;

            for(int i=bottom; i>=top; i--){
                res.add(matrix[i][left]);
            }
            left++;
            if(left>right) break;
        }
        return res;
    }
}
