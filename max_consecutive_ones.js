// problem: https://leetcode.com/problems/max-consecutive-ones/

var findMaxConsecutiveOnes = function(nums) {

  if(!nums || !nums.length || (nums.length===1 && nums[1]===0)) return 0;

  let max_count=0; let count=0; 

  for(let i=0; i<nums.length; i++){

     if(nums[i]===1){
        count++;
        max_count = Math.max(max_count,count);
     }
     else{
        count = 0;
     }
  }
  return max_count;
    
};

// time complexity : O(n)
// space complexity : O(1);
