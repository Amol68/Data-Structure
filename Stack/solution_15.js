
// https://leetcode.com/problems/largest-rectangle-in-histogram/
// refer: https://takeuforward.org/data-structure/area-of-largest-rectangle-in-histogram

function largestRectangleArea(heights: number[]): number {

    //if (!heights || !heights.length) return 0;

    let n: number = heights.length;
    let leftSmall: number[] = new Array(n);
    let rightSmall: number[] = new Array(n);
    let stack: number[] = [];
    let maxArea = 0;
    // 
    for (let i = 0; i < n; i++) {

        while (stack.length && heights[stack[stack.length-1]] >= heights[i]) {
            stack.pop()
        }

        leftSmall[i] = stack.length === 0 ? 0 : stack[stack.length-1] + 1;
        stack.push(i);
    }

  stack.length =0;

    for (let i = n - 1; i >= 0; i--) {

        while (stack.length && heights[stack[stack.length-1]] >= heights[i]) {
            stack.pop();
        }

        rightSmall[i] = stack.length == 0 ? n - 1 : stack[stack.length-1] - 1;
        stack.push(i);
    }

    for(let i=0; i<n; i++){
        let width = (rightSmall[i]-leftSmall[i])+1;
        maxArea = Math.max(maxArea,width * heights[i]);
    }

    return maxArea;

};

//Time Complexity: O(N). Single loop at the end using O(N)
//Space Complexity: O(3N) where 3 is for the stack, left small array and a right small array

// -------------------------->>-------------------------->>-------------------------->>-------------------------->>-------------------------->>
