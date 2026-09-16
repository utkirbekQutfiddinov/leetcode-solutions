class Solution {
    public int[] scoreValidator(String[] events) {
        int score=0, counter=0;
        Set<String> add=Set.of("0","1","2","3","4","5","6");
        for(String event: events){
            if(add.contains(event)){
                score+=Integer.parseInt(event);
            }else if("W".equals(event)){
                counter++;
            }else if(Set.of("WD","NB").contains(event)){
                score++;
            }
            if(counter==10){
                break;
            }
        }
        return new int[]{score, counter};
    }
}