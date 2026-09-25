class Solution {
    public double largestTriangleArea(int[][] points) {
        double res=0.0d;
        for(int i=0; i<points.length-2; i++){
            for(int j=i+1; j<points.length-1; j++){
                for(int z=j+1; z<points.length; z++){
                    System.out.println(Arrays.toString(points[i])+":"+Arrays.toString(points[j])+":"+Arrays.toString(points[z]));
                    res=Math.max(res,getArea(points[i], points[j], points[z]));
                }
            }
        }
        return res;
    }

    private double getArea(int[] x, int[]y, int[]z){
        return 0.5*Math.abs(x[0]*y[1]+y[0]*z[1]+z[0]*x[1]-x[1]*y[0]-y[1]*z[0]-z[1]*x[0]);
    }
}