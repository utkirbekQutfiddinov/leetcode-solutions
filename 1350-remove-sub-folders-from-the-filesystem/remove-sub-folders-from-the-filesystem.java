class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        String prev=folder[0];

        List<String> res=new ArrayList<>();
        res.add(prev);
        for(int i=1; i<folder.length; i++){
            if(!folder[i].startsWith(prev+"/")){
                res.add(folder[i]);
                prev=folder[i];
            }
        }

        return res;
    }
}