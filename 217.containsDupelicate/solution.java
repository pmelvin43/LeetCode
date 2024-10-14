import java.util.HashSet;

class solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3};

        System.out.println(hasDuplicate(nums));

    }


    public static boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}