// problem: https://leetcode.com/problems/first-bad-version/
var solution = function (isBadVersion: any) {

    return function (n: number): number {

        let left: number = 1;
        let right: number = n;
        let ans: number = -1;

        while (left <= right) {

            let mid = Math.floor((left + right) / 2);

            if (!!isBadVersion(mid)) {
                ans = mid;
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }

        }

        return ans;
    };
};

//  time complexity : O(log n)
// space complexity : O(1)
