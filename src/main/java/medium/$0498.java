package medium;

public class $0498 {
    public int[] findDiagonalOrder(int[][] mat) {
        int M = mat.length;
        int N = mat[0].length;
        int k = 0;
        int l = 0;
        int i = 0;
        int[] res = new int[M*N];
        while(k < M && l < N) {
            //scan up loop
            while(k > -1 && l < N) {
                res[i++] = mat[k][l];
                k--;
                l++;
            }
            //for choosing next start for scan down, we see if
            //there is next column, if not we reduce the row
            if (l >= N) {  //there is no next column
                l--;
                k+=2;
            } else { //there is next column
                k++;
            }
            //scan down loop
            while(l > -1 && k < M) {
                res[i++] = mat[k][l];
                l--;
                k++;
            }
            //for choosing next start for scan up, we see if
            //there is next row, if not we reduce the column
            if (k >= M) { //there is no next row
                k--;
                l+=2;
            } else { //there is next row
                l++;
            }
        }
        return res;
    }
}
