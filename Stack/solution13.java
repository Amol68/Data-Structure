// problem: https://leetcode.com/problems/next-greater-element-ii/description/

function nextGreaterElements(nums: number[]): number[] {
    
    const n :number = nums.length;
    const ans : number[] = new Array(n);
    const st = new Array();

   for(let i=2*n-1; i>=0; i--){

     while(st.length && nums[st[st.length-1]] <= nums[i%n]){
        st.pop();
     }

   ans[i%n] = !st.length ? -1 : nums[st[st.length-1]];

   st.push(i%n);

   }

   return ans;

};

// Time Complexity : O(2n) which becomes O(n)
// Space Complexity : O(n)
