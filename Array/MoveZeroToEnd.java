public class MoveZeroToEnd{
    public void moveZeroes(int[] nums) {

//        approch 01
        int leftIdx = -1;
        for(int i =0; i<nums.length;i++){
            if(nums[i] != 0){
                int temp = nums[++leftIdx];
                nums[leftIdx] = nums[i];
                nums[i] = temp;
            }
        }

        // two pointer Approch
        int left =0;
        int right = nums.length-1;
        while(left<right){
            if(nums[left] ==0 && nums[right] !=0 ){
                int temp = nums[right];
                nums[right--] = nums[left];
                nums[left++] = temp;
            }
            else if (nums[left] != 0)
                left++;
            else if(nums[right] != 0)
                right --;
        }


    }
}
