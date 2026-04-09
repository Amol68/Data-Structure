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

// ----------------------> ----------------------> ----------------------> ----------------------> ---------------------->

// Better Approach
function trap(height: number[]): number {

    if(!height || !height.length) return 0;

    const leftMax:number[] = [];
    const rightMax:number[] = [];
    const n:number = height.length;
    leftMax[0] = height[0];
    rightMax[n - 1] = height[n - 1];
    let totalWater:number = 0;

    for (let i = 1; i < n ; i++) {
        leftMax[i] = Math.max(height[i], leftMax[i - 1]);
    }

    for (let i = n - 2; i >= 0; i--) {
        rightMax[i] = Math.max(height[i], rightMax[i + 1]);
    }

    for (let i = 0; i < n; i++) {
        totalWater += Math.min(leftMax[i], rightMax[i]) - height[i];
    }

    return totalWater;

};


// Time Complexity: O(n);
// Space Complexity : O(n)

// ----------------------> ----------------------> ----------------------> ----------------------> ---------------------->

// Optimal Approach
function trap(height: number[]): number {

    if (!height || !height.length) return 0;
    const n:number = height.length;
    let left:number = 0;
    let right:number = n - 1;
    let leftMax:number = height[0];
    let rightMax:number= height[n - 1];
    let result:number = 0;

    while (left < right) {

        if (leftMax < rightMax) {

            left += 1;

            leftMax = Math.max(leftMax, height[left]);

            result += leftMax - height[left];

        }
        else {

            right-=1;
             rightMax=Math.max(rightMax,height[right]);
             result+=rightMax-height[right]
        }

    }

    return result;

};


// Time Complexity: O(n);
// Space Complexity : O(1)

