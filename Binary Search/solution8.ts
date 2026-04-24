// problem:https://leetcode.com/problems/single-element-in-a-sorted-arra

// brute force approach

function singleNonDuplicate(nums: number[]): number {

    let n:number = nums.length;
    if(n===1) return nums[0];

     for(let i=0; i<n-1; i+=2){


        if(nums[i]!==nums[i+1]) return nums[i]
     }

     return nums[n-1];
};

// Time Complexity: O(n)
// Space Complexity:O(1)


//------------>------------>------------>------------>------------>------------>------------>------------>------------>------------>

// Optimized Approach
// reference: https://www.youtube.com/watch?v=AZOmHuHadxQ
function singleNonDuplicate(nums: number[]): number {

    let n: number = nums.length;
    if (n === 1) return nums[0];

    if (nums[1] !== nums[0]) return nums[0];

    if (nums[n - 1] !== nums[n - 2]) return nums[n - 1];

    let left: number = 1;
    let right: number = n - 2;

    while (left <= right) {

        let mid = Math.floor((left + right) / 2);

        if (nums[mid] !== nums[mid - 1] && nums[mid] !== nums[mid + 1]) return nums[mid];

        if ( (mid % 2 !== 0 && nums[mid] === nums[mid - 1]) || (mid % 2 === 0 && nums[mid] === nums[mid + 1])) {
            left = mid + 1;
        }else {
            right = mid - 1;
        }

    }

    return 1;
};

// Time Complexity: O(log n)
// Space Complexity:O(1)
