// problem: https://leetcode.com/problems/guess-number-higher-or-lower/

function guessNumber(n: number): number {

    let left: number = 1;
    let right: number = n;
    let ftr: number = -1;

    while (left <= right) {

        let mid = Math.floor((left + right) / 2);
        let guessed = guess(mid)

        if (guessed <= 0) {
            ftr = mid;
            right = mid - 1;
        }
        else {
            left = mid + 1;
        }
    }

    return ftr;
   
};

//  Time Complexity : O(log n)
//  time complexity : O(1)
