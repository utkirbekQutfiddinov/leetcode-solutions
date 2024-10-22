class Solution {
    public String removeDigit(String number, char digit) {
        TreeSet<String> set=new TreeSet<>(Comparator.reverseOrder());

        for(int i=0; i<number.length(); i++){
            if(number.charAt(i)==digit){
                set.add(number.substring(0,i)+number.substring(i+1));
            }
        }

        return set.iterator().next();
    }
}