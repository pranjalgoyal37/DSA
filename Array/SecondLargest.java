public class SecondLargest{
    public static int secondLargestElement(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
            else if (largest!=nums[i] && nums[i]>second_largest)
                second_largest = nums[i];
        }
        second_largest = (second_largest == Integer.MIN_VALUE) ? -1 : second_largest;
        System.out.println(second_largest);
        return largest;
    }
}
