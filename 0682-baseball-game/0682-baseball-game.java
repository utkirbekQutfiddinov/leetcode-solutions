class Solution {
    public int calPoints(String[] operations) {
        List<Integer> scores=new ArrayList<>();
        for(String op: operations){
            try{
                int score=Integer.parseInt(op);
                scores.add(score);
            }catch(Exception ex){
                switch(op){
                    case "+":{
                        int size=scores.size();
                        int score1=scores.get(size-1);
                        int score2=scores.get(size-2);
                        scores.add(score1+score2);
                        break;
                    }
                    case "D":{
                        int size=scores.size();
                        int score1=scores.get(size-1);
                        scores.add(score1*2);
                        break;
                    }
                    case "C":{
                        int size=scores.size();
                        int score1=scores.remove(size-1);
                        break;
                    }
                }
            }
        }
        int points=0;
        for(int score: scores){
            points+=score;
        }
        return points;
    }
}