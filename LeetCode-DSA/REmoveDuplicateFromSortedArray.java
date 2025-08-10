public class REmoveDuplicateFromSortedArray {
     public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {

        REmoveDuplicateFromSortedArray solution = new REmoveDuplicateFromSortedArray();
        
        int[] nums = {1, 1, 2, 2, 3, 4, 4};
        int newLength = solution.removeDuplicates(nums);
        
        System.out.println("New length: " + newLength);
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();


    }

}
