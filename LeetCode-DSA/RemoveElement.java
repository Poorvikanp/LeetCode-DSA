import java.util.Arrays;

public class RemoveElement {
    // Removes all occurrences of val from nums, returns new length
    public int removeElement(int[] nums, int val) {
        int index = 0; // position to place the next non-val element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index; // new length
    }
public static void main(String[] args) {
    RemoveElement sol = new RemoveElement();

        int[] nums = {3, 2, 2, 3, 4, 2, 5};
        int val = 2;

        int newLength = sol.removeElement(nums, val);

        System.out.println("New length: " + newLength);
        System.out.print("Array after removal: ");
        System.out.println(Arrays.toString(Arrays.copyOf(nums, newLength)));
}
}
