// Better Approach:
// -> If k=arr.length, array comes back to its original position.
// -> If k=8 and arr.length=9 , it becomes 8+1 i.e just rotate array by 1 position.
// -> It means , k= k%arr.length.
// -> Anything k less than arr.lenth is easy to solve 

class Solution {
    public void rotate(int[] nums, int k) {
   
     int n = nums.length;

     if(n==0 || nums==null) return;
     k=k%n;
     if(k==n) return;
     int[] temp = new int[k];
     int temp_index = 0;

      for(int i=n-k; i<n; i++){
        temp[i+k-n]=nums[i];
      }

      for(int i=n-k-1; i>=0; i--){
        nums[i+k]=nums[i];
      }

      for(int i=0; i<k;i++){
        nums[i]=temp[i];
      }

    return;
    }
   }

// Time Complexity: O(n);
// Space Complexity: O(k) as 'k' elements are stored in temp; 


--------->--------->--------->--------->--------->--------->--------->--------->--------->--------->--------->--------->--------->--------->--------->--------->--------->--------->--------->


Optimal Approach:
-> Reverse entire given array i.e reverse(nums,0,nums.length)
-> Reverse first k elements i.e reverse(nums,0,k-1);
-> Reverse remaining elements i.e reverse(nums,k,nums.length);

class Solution {
    public void rotate(int[] nums, int k) {
   
     int n = nums.length;
     if(n==0 || nums==null) return;
     k=k%n;
     if(k==n) return;

    
    reverse(nums,0,n-1);
    reverse(nums,0,k-1);
    reverse(nums,k,n-1);

    return;
    }

    public static void reverse(int[] nums,int start,int end){

        while(start<=end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }

    }

   }

Time Complexity - O(N) where N is the number of elements in an array
Space Complexity - O(1) since no extra space is required




