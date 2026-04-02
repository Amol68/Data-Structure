
// https://leetcode.com/problems/daily-temperatures/description/

function dailyTemperatures(temperatures: number[]): number[] {

if (!temperatures || !temperatures.length) return [];

    const n = temperatures.length;
    let ans: number[] = new Array(n).fill(0); // answer array
    let s:number[] = []; //monotonic stack;

    for(let i=n-1; i>=0; i--){

      let element = temperatures[i];

      while(s.length && element>=temperatures[s[s.length-1]]) s.pop();

      if(!s.length) {
        ans[i]=0;;
        s.push(i);
      }

       else{
        ans[i]=s[s.length-1]-i;
        s.push(i);
       }

    }

    return ans;
};

// Time Complexity : O(n);
// The algorithm iterates through the temperatures array once from right to left. 
// Although there's a nested while loop inside the for loop, each element is pushed onto the stack exactly once and popped at most once.
// This means that across the entire execution, the total number of operations for stack push and pop combined is at most 2n. 
// Therefore, the amortized time complexity is O(n), where n is the length of the temperatures array.

//Space Complexity: O(n)
//The algorithm uses two additional data structures:
//The stack stk which in the worst case (when temperatures are in increasing order) can store all n indices
//The answer array ans which has exactly n elements
//Both contribute to a space complexity of O(n), where n is the length of the temperatures array.
