public class Main {
    public int[] leet1480(int[] nums) {

        for(int i = 1; i < nums.length; i++){
            nums[i] = nums[i-1] + nums[i];
        }
        return nums;
    }
}