import java.util.*;

public class SearchSortedArray {

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // Target found
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // Target not found, return the index where it would be inserted
        return left;
    }

    public static void main(String[] args) {
        // Example usage:
        //int[] nums = new int[]{1, 3, 5, 6};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int size = sc.nextInt();
		
		int nums[] = new int[size];
		System.out.println("ENter array elements");
		for(int i=0; i<size;i++){
			
			nums[i] = sc.nextInt();
		}
        System.out.println("Enter Traget");
		
		int target = sc.nextInt();
		
        int result = searchInsert(nums, target);
        System.out.println("Index: " + result);
    }
}
