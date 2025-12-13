class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[]isActive) {
        String tempCode;
        Set<String> validBusinessLines=Set.of("electronics","grocery","pharmacy","restaurant");
        
        Map<String,List<String>> map=new HashMap<>();


        for(int i=0; i<code.length; i++){
            if(!isActive[i]){
                continue;
            }

            if(!validBusinessLines.contains(businessLine[i])){
                isActive[i]=false;
                continue;
            }

            if(!isValidCode(code[i])){
                isActive[i]=false;
                continue;
            }
        }


        for(int i=0; i<isActive.length; i++){
            if(isActive[i]){
                List<String> codes=map.getOrDefault(businessLine[i],new ArrayList<>());
                codes.add(code[i]);
                map.put(businessLine[i],codes);
            }
        }

        for(String key: map.keySet()){
            Collections.sort(map.get(key));
        }


        List<String> result=new ArrayList<>();
        result.addAll(map.getOrDefault("electronics",new ArrayList<>()));
        result.addAll(map.getOrDefault("grocery",new ArrayList<>()));
        result.addAll(map.getOrDefault("pharmacy",new ArrayList<>()));
        result.addAll(map.getOrDefault("restaurant",new ArrayList<>()));

return result;

    }

    private boolean isValidCode(String code){
        if(code==null||code.isEmpty()){
            return false;
        }
        for(char c: code.toCharArray()){
            if(!Character.isLetterOrDigit(c)&&c!='_'){
                return false;
            }
        }
        return true;
    }
}