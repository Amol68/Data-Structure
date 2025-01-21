// Brute Force 
// change: implement hashset to store uinique duplicate values.

import java.util.*;
class Solution {

    public List<Integer> findDuplicates(int[] nums) {

        if(nums==null || nums.length<2) return new ArrayList<>();

        int n = nums.length;
         List<Integer> result = new ArrayList<>();

        if(nums.length==2 && nums[0]==nums[1]) {
            result.add(nums[0]);
            return result;
        } 

        
        int left,right;

        for(int i=0; i<nums.length-1; i++){
         left=i+1;
         right=n-1;

         while(left<=right){
            if(nums[left]==nums[i]) result.add(nums[i]);
            if(nums[right]==nums[i]) result.add(nums[i]);
            left++;
            right--;
         }
        }

        return result;
    }
}

// Time Complexity : Between O(n) and O(n^2);
// Space Compkexity : O(n) 


------------->------------->------------->------------->------------->------------->------------->------------->------------->------------->------------->------------->------------->
// Optimal Solution (ref: Nikhil Lohia)

import java.util.*;
class Solution {

    public List<Integer> findDuplicates(int[] nums) {

        if(nums==null || nums.length<2) return new ArrayList<>();

        int n = nums.length;
         List<Integer> result = new ArrayList<>();

        if(nums.length==2 && nums[0]==nums[1]) {
            result.add(nums[0]);
            return result;
        } 


        for(int i=0; i<nums.length; i++){

          int index = Math.abs(nums[i])-1;

           if(nums[index]<0) result.add(index+1);

           nums[index]=nums[index]*-1;  
        }

        return result;
    }
}

// Time Complexity :O(n) ;
// Space Compkexity : O(1) 
