class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int first = firstOcc(nums , target);
        int last = lastOcc(nums , target);

        List<Integer> ans = new ArrayList<>();
        if(first == -1 && last == -1) return ans;
        for(int i=first;i<=last;i++) ans.add(i);
        return ans;
    }
    int firstOcc(int[] nums, int t){
        int l=0, r=nums.length - 1, ans = -1;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(nums[mid] == t){
                ans = mid;
                r = mid - 1;
            }
            else if(nums[mid] < t) l = mid + 1;
            else r = mid - 1;
        }
        return ans;
    }
    int lastOcc(int[] nums, int t){
        int l=0, r=nums.length - 1, ans = -1;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(nums[mid] == t){
                ans = mid;
                l = mid + 1;
            }
            else if(nums[mid] < t) l = mid + 1;
            else r = mid - 1;
        }
        return ans;
    }
}