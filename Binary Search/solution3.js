// https://leetcode.com/problems/search-in-rotated-sorted-array/

function search(nums: number[], target: number): number {

    const n: number = nums.length;
    let left: number = 0;
    let right: number = n - 1;

    while (left <= right) {
        let mid = Math.floor((left + right) / 2);
        if (nums[mid] === target) return mid;



        if (nums[left] <= nums[mid]) {

            if (nums[left] <= target && target <= nums[mid]) {
                right = mid - 1
            }
            else {
                left = mid + 1;
            }

        } else {
            if (target > nums[mid] && target <= nums[right]) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }


        }
    }

   return -1;
};

// Time Complexity : O(log n)
// Space Complexity : O(1)
