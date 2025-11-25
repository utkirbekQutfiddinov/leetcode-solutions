class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int n=1, t=1;

        if(name.charAt(0)!=typed.charAt(0)){
            return false;
        }

        while(t<typed.length() && n<name.length()){
            if(typed.charAt(t)==name.charAt(n)){
                t++;
                n++;
            }else if(typed.charAt(t)==typed.charAt(t-1)){
                t++;
            }else {
                return false;
            }
        }

        if(n==name.length()){
            while(t<typed.length()){
                if(typed.charAt(t)!=typed.charAt(t-1)){
                    return false;
                }
                t++;
            }
        }


        return t==typed.length() && n==name.length();
    }
}