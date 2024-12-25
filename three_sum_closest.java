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

// Optimozed Approach

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
         if(nums==null || nums.length<3) 
          throw new IllegalArgumentException("Input array must have at least 3 elements.");

        Arrays.sort(nums);
        int length = nums.length;
        int min_diff = Integer.MAX_VALUE;
        int sum=nums[0]+nums[1]+nums[2];
        

        for(int i=0; i<length-2; i++){

             if( (i>0) && nums[i]==nums[i-1]) continue;

            int left = i+1;
            int right = length-1;

            while(left < right){

                //if((left>0 && right<length-1) && (nums[left]!=nums[right])) continue;
                int curr_sum = nums[i]+nums[left]+nums[right];

                
                if(curr_sum <target) left++;
                if(curr_sum >target) right--; 

                int diff = Math.abs(target-curr_sum );

                if(diff==0) return curr_sum;

                if(diff<min_diff){
                    min_diff = diff;
                    sum = curr_sum;    
                }

            }
        }

      return sum;
                   
    }
}

// Time Complexity: O(n^2)
// Space Complexiyu: O(1)
