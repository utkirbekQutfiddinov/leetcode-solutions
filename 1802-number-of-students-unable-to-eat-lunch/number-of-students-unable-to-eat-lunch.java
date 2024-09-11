class Solution {
    public int countStudents(int[] students, int[] sand) {
        Queue<Integer> q=new LinkedList<>();
        Set<Integer> st=new HashSet<>();
        for(int i=0; i<students.length; i++){
            q.add(i);
        }
        System.out.println("students que: "+q);
        int ind=0;

        for(int i=0; i<sand.length; i++){
            ind = q.poll();
            System.out.print("checking "+i+" th sandwich and "+ind+" th student. ");
            if(students[ind]==sand[i]){
                System.out.println(ind + " th takes "+sand[i]);
                st.clear();
            }else {
                System.out.println(ind + " th does not want "+sand[i]);
                q.add(ind);
                if(st.contains(ind)){
                    break;
                }
                st.add(ind);
                i--;
            }
        }

        return q.size();
    }
}