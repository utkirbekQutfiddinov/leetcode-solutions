class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        List<String> list=new ArrayList<>();
        int ones=0, left=0, right=0, minLen=Integer.MAX_VALUE;

        while(right<s.length()){
            while(left<=right && s.charAt(left)=='0'){
                left++;
            }

            if(s.charAt(right)=='1'){
                ones++;
            }

            right++;

            if(ones==k){
                minLen=Math.min(minLen, right-left);
                list.add(s.substring(left, right));
                ones--;
                left++;
            }
        }

        int len=minLen;
        list=list.stream()
                .filter(a->a.length()==len)
                .sorted()
                .toList();
        
        return list.isEmpty()?"":list.getFirst();
    }
}