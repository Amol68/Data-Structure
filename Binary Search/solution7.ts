// problem:https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
// reference: https://www.youtube.com/watch?v=bvaYNDKp830

function searchRange(nums: number[], target: number): number[] {


    let firstIndex: number = findIndex(nums, target, "left");
    let lastIndex: number = findIndex(nums, target, "right");


    return [firstIndex, lastIndex]
};

function findIndex(nums: number[], target: number, direction: string): number {
    let index: number = -1;
    let n: number = nums.length;
    let left: number = 0;
    let right: number = n - 1;

    while (left <= right) {

        let mid: number = Math.floor((left + right) / 2);

        if (nums[mid] === target) {
            index = mid;
            if (direction === "left") {

                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        else if (nums[mid] < target) {
            left = mid + 1
        }
        else {
            right = mid - 1
        }

    }

    return index;
}

// Time Complexity: O(log n) - Two binary searches, each taking O(log n) time

//Space Complexity: O(1) - Only using a constant amount of extra space for variables
