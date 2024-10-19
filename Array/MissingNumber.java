public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int sumOfArray = 0;
        int size = nums.length + 1;
        for (int i = 0; i < nums.length; i++) {
            sumOfArray += nums[i];
        }
        System.out.println(sumOfArray + "---" + size);
        return (size * (size - 1)) / 2 - sumOfArray;
    }
}
