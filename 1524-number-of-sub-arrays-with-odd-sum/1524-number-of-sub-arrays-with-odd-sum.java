class Solution {
    public int numOfSubarrays(int[] arr) {

        long ans = 0 , even = 1, odd = 0, sum = 0;
        long mod = 1_000_000_007L;
        for(long ele : arr){
            sum += ele;
            if(sum % 2 == 0){
                ans += odd;
                even++;
            }
            else{
                ans += even;
                odd++;

            }
        }
        return (int) (ans % mod);
    }
}