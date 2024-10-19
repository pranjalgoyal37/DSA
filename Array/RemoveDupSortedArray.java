public  class RemoveDupSortedArray{
 public int removeDuplicates(int[] nums) {
           int left = 0;
        // 0 0 3 3 5 6 
        for(int i =1; i<nums.length; i++){
            if(nums[left] != nums[i])
                nums[++left] = nums[i];
        }
        return left+1;
    }
}
