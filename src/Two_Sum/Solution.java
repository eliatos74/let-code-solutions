package Two_Sum;

public class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] reult = new int[0];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(i!=j && nums[i]+nums[j]==target){
                    reult = new int[]{i,j};
                }
            }
        }

        return reult;
    }
}