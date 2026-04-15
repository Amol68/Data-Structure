//problem:https://leetcode.com/problems/sqrtx/

function mySqrt(x: number): number {


    let ans: number = 1;
    for (let i = 1; i <= x; i++) {

        if (i * i <= x) {
            ans = i;

        }

        else {
            break;
        }

    }

    return ans;

};

// Time Complexity:O(n);
// Space Complexity : O(1);


// --------------------->--------------------->--------------------->--------------------->--------------------->--------------------->

function mySqrt(x: number): number {

    let left = 1;
    let right = x;

    while (left <= right) {

        let mid = Math.floor((left + right) / 2)

        if ((mid * mid) > x) {
            right = mid - 1;
        }
        else {
            left = mid + 1;
        }
    }

    return right;

};


// Time Complexity:O(n);
// Space Complexity : O(1);
