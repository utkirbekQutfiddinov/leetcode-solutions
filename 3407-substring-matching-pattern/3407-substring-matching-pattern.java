class Solution {
    public boolean hasMatch(String s, String p) {
        if(p.startsWith("*")) return s.indexOf(p.substring(1))>=0;
        if(p.endsWith("*")) return s.indexOf(p.substring(0,p.length()-1))>=0;

        String[] parts=p.split("[*]");
        int ind=s.indexOf(parts[0]);
        if(ind<0) {
            System.out.println("s="+s+", p="+p+", ind="+ind);
            return false;
        }

        int ind2=s.indexOf(parts[1],ind+parts[0].length());
        if(ind2<0) {
            System.out.println("s="+s+", p="+p+", ind="+ind+", ind2="+ind2);
            return false;
        }

        return true;
    }
}