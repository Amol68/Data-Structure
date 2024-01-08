// HINT -> take the lowest number and sum of all differences with other numbers

class Solution {
    public int minMoves(int[] nums) {
        
       int min = Arrays.stream(nums).min().getAsInt(); // API to find min element from an array
       int count = 0;
       int diff;

       for(int i=0; i<nums.length; i++){
           diff = nums[i]-min;
           count = count+diff;
       }

       return count;
    }
}


// Time Complexity: BigO(n)
// Space Complexity: BigO(1)

