class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        List<String> list=new ArrayList<>();
        int ones=0;
        int left=0, right=0;
        int minLen=Integer.MAX_VALUE;

        while(right<s.length()){
            while(left<=right && s.charAt(left)=='0'){
                System.out.println(s.substring(left,right)+", left=0");
                left++;
            }

            if(s.charAt(right)=='1'){
                ones++;
            }

            right++;

            if(ones==k){
                String sub=s.substring(left, right);
                minLen=Math.min(minLen, right-left);
                list.add(sub);
                ones--;
                left++;
            }
        }


        System.out.print(list);
        int len=minLen;
        list=list.stream().filter(a->a.length()==len).toList();
        System.out.println("=>"+list);
        
        if(list.isEmpty()){
            return "";
        }

        String result=list.getFirst();
        for(String str: list){
            if(str.compareTo(result)<0){
                result=str;
            }
        }
        return result;
    }
}