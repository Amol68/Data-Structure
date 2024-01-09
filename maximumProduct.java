class Solution {
    public int maximumProduct(int[] nums) {

       
        int length = nums.length;

    if(length==0) return 0;
         

    else if(length==1) return nums[0];
        
      
    else if(length==2) return nums[0]*nums[1];
          
        
    else{
        Arrays.sort(nums);
        int p1,p2;
        int n1 = nums[length-1];
        int n2 = nums[length-2];
        int n3 = nums[length-3];
        
        p1 = n1*n2*n3;
        p2 = nums[0]*nums[1]*n1;

        return Math.max(p1,p2) ;
    }
    }
}

Approach:
Sort the array in ascending order.
Calculate two possible products:
a: Product of the two smallest numbers and the largest number.
b: Product of the three largest numbers.
Return the maximum of a and b.

Complexity:
Time complexity: O(nlog⁡n)O(n \log n)O(nlogn) - Sorting the array takes O(nlog⁡n)O(n \log n)O(nlogn) time.
Space complexity: O(1)O(1)O(1) - Constant space is used.
