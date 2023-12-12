import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        // Create a map to store the complement of each element and its index
        Map<Integer, Integer> complementMap = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement needed to reach the target
            int complement = target - nums[i];

            // Check if the complement is in the map
            if (complementMap.containsKey(complement)) {
                // If found, return the indices of the two numbers
                return new int[]{complementMap.get(complement), i};
            } else {
                // Otherwise, store the current number and its index in the map
                complementMap.put(nums[i], i);
            }
        }

        // No solution found, return an empty array or handle it as needed
        return new int[]{};
    }

    public static void main(String[] args) {
		
		//int nums[] = new int[7];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size:");
		int size = sc.nextInt();
		
		System.out.println("Enter array elements"); 
		int nums[] = new int[size];
		for(int i = 0; i<nums.length; i++){
			
			nums[i] = sc.nextInt();
			
		}
		System.out.println("ENter target");
		
		int target = sc.nextInt()
		;
		/*System.out.println("Array elements are:");
		for(int i =0; i<arr.length;i++){
			
			System.out.println(arr[i]);
			
		}
		*/
        // Example usage:
        //int[] nums = {2, 7, 11, 15};
        //int target = 9;
        int[] result = twoSum(nums, target);

        // Print the result
        for (int index : result) {
            System.out.print(index + " ");
        }
    }
}
