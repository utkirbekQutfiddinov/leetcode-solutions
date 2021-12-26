package medium;

public class $1689 {
    public int minPartitions(String n) {
        char c='0';
        for(int i=0; i<n.length(); i++)
        {
            if(i==0) c=n.charAt(i);
            else if(n.charAt(i)>c) c=n.charAt(i);
        }

        return ((int)c-48);

    }
}
