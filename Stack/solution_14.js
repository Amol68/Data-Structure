// description: https://leetcode.com/problems/trapping-rain-water/description/

// Brute Force Approach
let total = 0;
for(let curr = 0; curr<heights.length; curr++){
    
let left_max = 0;
let right_max = 0;

for(let i=0; i<=curr; i++){
  
  if(heights[i]>left_max) left_max=heights[i];  
}

for(let j=curr; j<heights.length; j++){
    if(heights[j]>right_max) right_max=heights[j];
}

    
 total += Math.min(left_max,right_max) - heights[curr];  
}

// Time Complexity: O(n^2);
// Space Complexity : O(n)
