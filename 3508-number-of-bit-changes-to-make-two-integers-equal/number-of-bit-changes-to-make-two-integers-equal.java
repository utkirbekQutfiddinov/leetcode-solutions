class Solution {
    public int minChanges(int n, int k) {
        int count=0;
        StringBuilder sn=binary(n), sk=binary(k);

        if(sn.length()<sk.length()){
            return -1;
        }
        if(sn.length()>sk.length()){
        int diff=sn.length()-sk.length();
            for(int i=0; i<diff; i++){
                sk.insert(0,'0');
            }
        }

        for(int i=0; i<sn.length(); i++){
            if(sk.charAt(i)>sn.charAt(i)){
                return -1;
            }else if(sn.charAt(i)>sk.charAt(i)){
                count++;
            }
        }
        
        return count;
    }

    private StringBuilder binary(int a){
        StringBuilder sb=new StringBuilder("");

        while(a>0){
            sb.insert(0,a%2);
            a/=2;
        }
        return sb;
    }
}