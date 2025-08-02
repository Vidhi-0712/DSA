class Solution {
    public static int removeDuplicates(int[] nums) {
        int u = 1;
        for (int i = 1; i <= nums.length - 1; i++) {
            if(nums[i] != nums[u-1]){
                nums[u] = nums[i];
                u++;
            }
        }
        return u;
    }
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = removeDuplicates(nums);

        System.out.println(k);

        System.out.print("nums = [");
        for (int i = 0; i < nums.length; i++) {
            if (i < k) {
                System.out.print(nums[i]);
            } else {
                System.out.print("_");
            }
            if (i < nums.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}