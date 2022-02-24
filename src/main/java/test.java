import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        generate(5);
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> tri = new ArrayList<>(numRows);

        for(int i = 0; i < numRows; i++){
            List curr = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i) curr.add(j, 1);
                else curr.add(0);
            }
            tri.add(curr);
        }
        if(numRows > 2){
            for(int i = 2; i < numRows; i++){
                for(int j = 1; j < i + 1 ; j++){
                    if(tri.get(i).get(j) == 0){
                        int n = tri.get(i - 1).get(j) + tri.get(i - 1).get(j - 1);
                        tri.get(i).add(j, n);
                    }
                }
            }

            return tri;
        }

        else return tri;
    }
}

