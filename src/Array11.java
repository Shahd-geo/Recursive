public class Array11 {
    public static int array11(int[] nums, int index){
        if (index==nums.length){
            return 0;
        }
        if (nums[index]==1){
            return 1 + array11(nums, index + 1);
        }

    }
}
