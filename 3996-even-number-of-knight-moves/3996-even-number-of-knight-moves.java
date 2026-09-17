class Solution {
    public boolean canReach(int[] start, int[] target) {
        Set<String> seen=new HashSet<>();
        Queue<String> que=new ArrayDeque<>();
        String st=start[0]+":"+start[1];
        String tar=target[0]+":"+target[1];
        que.add(st);
        seen.add(st);
        int move=-1;

        while(!que.isEmpty()){
            int size=que.size();
            System.out.println(que);
            move++;
            for(int i=0; i<size; i++){
                String curr=que.poll();
                System.out.println("curr="+curr);
                seen.add(curr);
                if(curr.equals(tar) && move%2==0){
                    return true;
                }else{
                    String[] parts=curr.split(":");
                    int[] cells=new int[]{Integer.parseInt(parts[0]),Integer.parseInt(parts[1])};

                    String next;
                    
                    if(cells[0]<=6 && cells[1]<=5){

                        next=(cells[0]+1)+":"+(cells[1]+2);
                        if(!seen.contains(next)){
                            que.add(next);
                            System.out.println("=>"+next);
                        }
                    }

                    if(cells[0]<=5 && cells[1]<=6){

                        next=(cells[0]+2)+":"+(cells[1]+1);
                        if(!seen.contains(next)){
                            que.add(next);
                            System.out.println("=>"+next);
                        }
                    }

                    if(cells[0]<=5 && cells[1]>=1){

                        next=(cells[0]+2)+":"+(cells[1]-1);
                        if(!seen.contains(next)){
                            que.add(next);
                            System.out.println("=>"+next);
                        }
                    }

                    if(cells[0]<=6 && cells[1]>=2){
                        next=(cells[0]+1)+":"+(cells[1]-2);
                        if(!seen.contains(next)){
                            que.add(next);
                            System.out.println("=>"+next);
                        }
                    }

                    if(cells[0]>=1 && cells[1]>=2){
                        next=(cells[0]-1)+":"+(cells[1]-2);
                        if(!seen.contains(next)){
                            que.add(next);
                            System.out.println("=>"+next);
                        }
                    }

                    if(cells[0]>=2 && cells[1]>=1){

                        next=(cells[0]-2)+":"+(cells[1]-1);
                        if(!seen.contains(next)){
                            que.add(next);
                            System.out.println("=>"+next);
                        }
                    }

                    if(cells[0]>=2 && cells[1]<=6){

                        next=(cells[0]-2)+":"+(cells[1]+1);
                        if(!seen.contains(next)){
                            que.add(next);
                            System.out.println("=>"+next);
                        }
                    }

                    if(cells[0]>=1 && cells[1]<=5){

                        next=(cells[0]-1)+":"+(cells[1]+2);
                        if(!seen.contains(next)){
                            que.add(next);
                            System.out.println("=>"+next);
                        }
                    }

                }
            }
        }
        return false;
    }
}