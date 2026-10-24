class Solution {
    int[] dm =  {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int sta = doy(arriveAlice);
        int ea = doy(leaveAlice);
        int stb = doy(arriveBob);
        int eb = doy(leaveBob);

        int ols = Math.max(sta , stb);
        int ole = Math.min(ea , eb);

        return Math.max(0 , ole - ols + 1);
    }
    int doy(String s){
        int m = Integer.parseInt(s.substring(0,2));
        int d = Integer.parseInt(s.substring(3,5));

        int day = 0;
        for(int i=0;i<m-1;i++) day += dm[i];
        
        return day + d;
    }
}