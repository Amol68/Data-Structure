// problem:https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

function findMin(nums: number[]): number {

    const n: number = nums.length;
    if (n === 1) return nums[0];

    if(n==2) return nums[0]<nums[1] ? nums[0] : nums[1]

    let left: number = 0;
    let right: number = n - 1;

    while (left <= right) {

        if(nums[left]<nums[right]) return nums[left];

        if(left === right) return nums[left];

        let mid = Math.floor((left + right) / 2);

        if (nums[left] <= nums[mid]) {
            left = mid+1 ;
        } else {
            right = mid ;
        }


    }

    return nums[left]

};

// Time Complexity : O(logn);
// Space Complexity : O(1);
