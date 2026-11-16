class Solution {
    public String digitSum(String s, int k) {
        while(s.length() > k) s = digsum(s , k);
        return s;
    }
    String digsum(String s, int k){
        StringBuilder res = new StringBuilder();
        int i=0;
        for(i=0;i<s.length()-k;i+=k){
            res.append(digsum(s.substring(i , i + k)));
        }
        res.append(digsum(s.substring(i , s.length())));
        return res.toString();
    }
    String digsum(String s){
        long sum = 0;
        for(int i=0;i<s.length();i++) sum += s.charAt(i) - '0';
        return String.valueOf(sum); 
    }
}