public clsss MaxConsecutiveOnes{
    public int findMaxConsecutiveOnes(int[] nums) {

        int maxCount =0;
        int count =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1)
                count++;
            else
                count =0;
            if(maxCount<count)
                maxCount = count;
        }
        return maxCount ;
    }
}
