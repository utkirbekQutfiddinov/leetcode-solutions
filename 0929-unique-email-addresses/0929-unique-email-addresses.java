class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueAdresses=new HashSet<>();
        String[] parts;

        for(String email: emails){
            parts=email.split("@");
            email=parts[0];

            if(email.indexOf("+")>=0)
            uniqueAdresses.add(email.substring(0,email.indexOf("+")).replace(".","")+"@"+parts[1]);
            else uniqueAdresses.add(email.replace(".","")+"@"+parts[1]);
        }

        return uniqueAdresses.size();
    }
}