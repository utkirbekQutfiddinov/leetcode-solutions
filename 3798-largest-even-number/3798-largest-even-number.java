class Solution {
    public String largestEven(String s) {
        int lastIndex=s.lastIndexOf('2');
        if(lastIndex>=0)
        return s.substring(0,lastIndex+1);
        else return "";
    }
}