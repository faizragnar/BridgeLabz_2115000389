import java.util.Arrays;

public class SearchChallenge {

    public static int findFirstMissingPositive(int[] nums) {
        int n = nums.length;
        
        
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }

        
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }

    
    public static int binarySearch(int[] arr, int target) {
        Arrays.sort(arr); 
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; 
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] numbers = {3, 4, -1, 1}; 
        int[] searchArray = {10, 3, 6, 7, 2, 8, 5}; 
        int target = 6; 

        int missingPositive = findFirstMissingPositive(numbers);
        System.out.println("First missing positive integer: " + missingPositive);

        int index = binarySearch(searchArray, target);
        System.out.println("Index of target " + target + ": " + index);
    }
}
