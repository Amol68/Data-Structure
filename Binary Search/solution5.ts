// problem: https://leetcode.com/problems/find-peak-element/
// reference: https://takeuforward.org/data-structure/peak-element-in-array;

function findPeakElement(nums: number[]): number {

    const n = nums.length;
    for (let i = 0; i < n; i++) {

        const left: boolean = !!(i === 0 || nums[i] >= nums[i - 1]);
        const right: boolean = !!(i === n - 1 || nums[i] >= nums[i + 1]);

        if (left && right) return i;

    }

    return -1;

};

// Time Complexity: O(N), we traverse the entire array once to find peak element.
// Space Complexity: O(1), constant additional space is used

// --------------> --------------> --------------> --------------> --------------> --------------> --------------> --------------> 


// if the array has only one element, then peak will be nums[0];

function findPeakElement(nums: number[]): number {

    const n = nums.length;

    if (n === 1) return 0;

    if (nums[1] < nums[0]) return 0;

    if (nums[n - 1] > nums[n - 2]) return n - 1;

    let left: number = 1;
    let right: number = n - 2;

    while (left <= right) {
        let mid: number = Math.floor((left + right) / 2);

        if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) return mid;

        if (nums[mid] > nums[mid - 1]) {
            left = mid+1;
        } else {
            right = mid-1
        }
    }

    return -1;

};

// Time Complexity: O(log N), we reduce the search space to half at every step using binary search.
// Space Complexity: O(1), constant additional space is used.
