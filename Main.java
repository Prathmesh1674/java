/*import java.util.Arrays;

public class Main {

    public static int removeElement(int[] nums, int val) {
        int p = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[p] = nums[i];
                p++;
            }
        }

        return p;
    }

    public static void main(String[] args) {

        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int k = removeElement(nums, val);

        System.out.println("Number of remaining elements: " + k);

        System.out.print("Updated array: ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}*/

import java.util.Scanner;

public class Main {

  public static int removeElement(int[] nums, int val) {
    int p = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[p] = nums[i];
        p++;
      }
    }

    return p;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input array size
    System.out.print("Enter size of array: ");
    int n = sc.nextInt();

    int[] nums = new int[n];

    // Input array elements
    System.out.println("Enter array elements:");
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }

    // Input value to remove
    System.out.print("Enter value to remove: ");
    int val = sc.nextInt();

    int k = removeElement(nums, val);

    System.out.println("Number of elements after removal: " + k);

    System.out.print("Modified array: ");
    for (int i = 0; i < k; i++) {
      System.out.print(nums[i] + " ");
    }

    sc.close();
  }
}