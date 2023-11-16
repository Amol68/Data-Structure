class Solution {
    public int[] productExceptSelf(int[] nums) {
   
         int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] res = new int[n];


        prefix[0]=nums[0];
        for(int i=1; i<n-1; i++){
            prefix[i]=prefix[i-1]*nums[i];
        }

        suffix[n-1]=nums[n-1];
        for(int i=n-2; i>=0; i--){
            suffix[i]=suffix[i+1]*nums[i];
        }

        res[0]=suffix[1];
        res[n-1]=prefix[n-2];
        for(int i=1; i<n-1; i++){
            res[i]=prefix[i-1]*suffix[i+1];
        }
     return res;
    }
}

//Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)
// but above solution , does not satisfy above space complexity follow up.
// space optimised approach:

class Solution {
    public int[] productExceptSelf(int[] nums) {
   
         int n = nums.length;
        int product_before=1;
        int product_after=1;
        int res[] = new int[n];
        
        for(int i=0; i<n; i++){
            res[i]=product_before;
            product_before*=nums[i];
        }

        for(int i=n-1; i>=0; i--){
            res[i]*=product_after;
            product_after*=nums[i];
        }

   return res;
    }


}
