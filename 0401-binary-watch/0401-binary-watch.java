class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result=new ArrayList<>(), hours, minutes;

        for(int hourLed=0; hourLed<=turnedOn; hourLed++){
            hours=new ArrayList<>();
            for(int hour=0; hour<=11; hour++){
                if(Integer.bitCount(hour)==hourLed){
                    hours.add(""+hour);
                }
            }

            minutes=new ArrayList<>();
            for(int minute=0; minute<=59; minute++){
                if(Integer.bitCount(minute)==turnedOn-hourLed){
                    minutes.add(minute>9?(""+minute):("0"+minute));
                }
            }

            for(int i=0; i<hours.size(); i++){
                for(int j=0; j<minutes.size(); j++){
                    result.add(hours.get(i)+":"+minutes.get(j));
                }
            }
        }
        
        return result;
    }
}