class Solution {
    public String reformatDate(String date) {
        String[] parts=date.split(" +");
        String day=parts[0].substring(0,parts[0].length()-2);
        String month=getMonth(parts[1]);
        String year=parts[2];
        return year+"-"+month+"-"+(day.length()==2?day:"0"+day);
    }

    private String getMonth(String m){
        return switch(m){
            case "Jan"->"01";
            case "Feb"->"02";
            case "Mar"->"03";
            case "Apr"->"04";
            case "May"->"05";
            case "Jun"->"06";
            case "Jul"->"07";
            case "Aug"->"08";
            case "Sep"->"09";
            case "Oct"->"10";
            case "Nov"->"11";
            case "Dec"->"12";
            default ->"";
        };
    }
}