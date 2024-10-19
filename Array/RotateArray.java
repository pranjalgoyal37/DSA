public class RotateArray{

        void reverseArray(int[] nums ,int start,int end){
            while(start< end){
                int temp = nums[start];
                nums[start++] = nums[end];
                nums[end--] = temp;
            }

        }
        public void rotate(int[] nums, int k) {
            int size = nums.length;
            k = k%size;

             // right rotate
            reverseArray(nums,0,size-k-1);
            reverseArray(nums,size-k,size-1);
            reverseArray(nums, 0, size - 1);

            // left rotate
            reverseArray(nums,0,k-1);
            reverseArray(nums,k,size-1);
            reverseArray(nums, 0, size - 1);
        }

}
