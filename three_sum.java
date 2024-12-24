//Better Approach
import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        if(nums==null || nums.length<3) {
            List<List<Integer>> result = new ArrayList<>();
        //     Integer[] boxedArray = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        //    result.add(Arrays.asList(boxedArray));
           return result;
        }
  
        Set<List<Integer>> result = new HashSet<>();
        Map<Integer,Integer>hmap = new HashMap<>();

        Arrays.sort(nums);
        int length = nums.length;

        for(int i=0; i<length; i++){
          hmap.put(nums[i],i);
      }

        for(int i=0; i<nums.length-2; i++){
           
       if(i>0 && nums[i]==nums[i-1]) continue;

        for(int j=i+1; j<length; j++){
         
          if(j>i+1 && nums[j]==nums[j-1]) continue;

        int sum = nums[i]+nums[j];
        int rem = 0-sum;
        
        if(hmap.containsKey(rem)){
            int indexOfRem = hmap.get(rem);
            
            if((indexOfRem!=i)&&(indexOfRem!=j)){
                Integer[] resultList={nums[i],nums[indexOfRem],nums[j]};
                //Integer[] boxedArray = Arrays.stream(resultList).boxed().toArray(Integer[]::new);

                Arrays.sort(resultList);
                result.add(Arrays.asList(resultList));
               
            }
        }
    }
   
        }

        return new ArrayList<>(result);

    }
}

//Time Complexity = O(n^2);
// Space Complexity = O(2n)
-------<>-------<>-------<>-------<>-------<>-------<>-------<>-------<>-------<>-------<>-------<>-------<>-------<>-------<>-------<>-------<>
// Ortimal Approach
    
import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        if(nums==null || nums.length<3) return new ArrayList<>();
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();

        for(int i=0; i<nums.length-2; i++){
            int left = i+1;
            int right = nums.length-1;

            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==0){
                 result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                 left++;
                 right--;
                }
        
                 else if(sum<0) 
                left++;
                  else
                right--;
            }
        }

        return new ArrayList<>(result);

    }
}

//Time Complexity = O(n^2);
// Space Complexity = O(n)
