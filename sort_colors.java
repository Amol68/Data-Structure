
class Solution {
    public void sortColors(int[] nums) {
       
        int l=0; int m=0; int h = nums.length-1;

        while(m<=h){

            int x = nums[m];

            if(x==0){
                swap(nums,l,m);
                l++;
                m++;
            }
            else if(x==1){
               m++;
            }
            else{
                swap(nums,m,h);
                h--;
            }
        }


    }

    private void swap(int[] nums,int a, int b){
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    


}

// Time complexity: O(n)
// Space complexity: O(1)
