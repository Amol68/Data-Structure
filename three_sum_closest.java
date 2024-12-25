// Brute Force Approach

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        if(nums==null || nums.length<3) 
         throw new IllegalArgumentException("Input array must have at least 3 elements.");

        int length = nums.length;
        int min_diff = Integer.MAX_VALUE;
        int sum_result=0;

        for(int i=0; i<length-2; i++){
            for(int j=i+1; j<length-1; j++){
                for(int k=j+1; k<length; k++){

                   int sum = nums[i]+nums[j]+nums[k];
                  

                   int diff = Math.abs(target-sum);

                   if(diff==0) return sum;
                   
                   if(diff<min_diff) {
                     min_diff = diff;
                     sum_result = sum;
                   }
                } // innermost loop 'k'
            } // inner loop 'j'
        } // outer loop 'i'
            return sum_result;

    }
}

// Time Complexity: O(n^3)
// Space Complexiyu: O(1)
// Key Takeaways: Math.abs() and throw new IllegalArgumentException();


//----->----->----->----->----->----->----->----->----->----->----->----->----->----->----->----->----->----->----->----->----->----->----->----->----->----->----->----->----->----->
