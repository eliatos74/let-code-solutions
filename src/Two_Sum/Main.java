package Two_Sum;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] result = solution.twoSum(new int[]{2,7,11,15}, 9);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}

