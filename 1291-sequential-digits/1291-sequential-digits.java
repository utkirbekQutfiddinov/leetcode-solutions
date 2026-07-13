class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result=new ArrayList<>();
        int from=(int)(Math.log(low)/Math.log(10))+1, to=(int)(Math.log(high)/Math.log(10))+1;

        String full="123456789";
        for(int i=from; i<=to; i++){
            for(int j=0; j+i<=9; j++){
                System.out.print("i="+i+", j="+j);
                String s=full.substring(j,j+i);
                try{
                int num=Integer.parseInt(s);
                System.out.println(", num="+num);
                if(num>=low && num<=high){
                    result.add(num);
                }
                }catch(Exception e){}
            }
        }
        return result;
    }
}