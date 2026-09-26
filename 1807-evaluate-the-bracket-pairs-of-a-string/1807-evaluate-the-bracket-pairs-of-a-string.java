class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map=new HashMap<>();
        for(List<String> pair: knowledge){
            map.put(pair.get(0), pair.get(1));
        }

        StringBuilder sb=new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                int end=s.indexOf(')',i);
                String key=s.substring(i+1, end);

                if(map.containsKey(key)){
                    sb.append(map.get(key));   
                }else{
                    sb.append('?');
                }
                i=end;
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}