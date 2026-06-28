import java.util.Arrays;

public class remove_duplicate_2 {

  public static int removeDuplicates(int[] nums) {

    int n = nums.length;

    if (n <= 2)
      return n;

    int k = 2;

    for (int i = 2; i < n; i++) {

      if (nums[i] != nums[k - 2]) {
        nums[k] = nums[i];
        k++;
      }
    }

    return k;
  }

  public static void main(String[] args) {

    int[] nums = { 1, 1, 1, 2, 2, 3 };

    int k = removeDuplicates(nums);

    System.out.println("k = " + k);

    System.out.print("Array after removing duplicates: ");

    for (int i = 0; i < k; i++) {
      System.out.print(nums[i] + " ");
    }
  }
}