// Better Approach:
import java.util.*;
class Solution {
    public int findDuplicate(int[] nums) {

        int n = nums.length;
       int dup=0;
        if(n==0 || n==1){
            return 0;
        }

        HashSet<Integer> hset = new HashSet<>();

        for(int i=0; i<n; i++){
            if(hset.contains(nums[i]))
            {
                dup = nums[i];
               break;
            }
            else{
                hset.add(nums[i]);
            }
        }
          return dup;
       
    }
}

// Time Complexity = O(n)
// Space Complexity = O(n)


// -----------> -----------> -----------> -----------> -----------> -----------> -----------> -----------> -----------> -----------> -----------> -----------> ----------->



import java.util.*;
class Solution {
    public int findDuplicate(int[] nums) {

        int n = nums.length;
       int dup=0;
        if(n==0 || n==1){
            return 0;
        }

        int slow = nums[0];
        int fast = nums[0];
       
       do{
        slow = nums[slow];
        fast = nums[nums[fast]];
       }
       while(slow!=fast);

       fast = nums[0];

       while(slow!=fast){
        fast = nums[fast];
        slow = nums[slow];
       }
        return slow;
       
    }

   
}

// Time Complexity = O(n)
// Space Complexity = O(1)
