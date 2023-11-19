import java.util.*;

// we are sorting the array as it give us O(nlogn) time complexity
class Solution {
    public int longestConsecutive(int[] nums) {
      
          HashSet<Integer> set = new HashSet<>();
        

          for(int i=0; i<nums.length; i++){
           set.add(nums[i]);
          }

          int ans = 0;  // size of Longest Consecutive Sequence

           if(nums.length==0){
              return ans;
          }
          for(int i=0; i<nums.length; i++){
              int count = 0; // starting from current element , how many consecutive elements do i have?
              int j = nums[i];

              if(set.contains(j-1)){  
                  continue;
              }
              while(set.contains(j)){
                    j++;
                  count++;
              }
              ans = Math.max(ans , count);
          }
               return ans;
        }
        
       
    }

//Time Complexity : O(n)
