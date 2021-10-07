package array.practice;

public class BinarySearchAlgorithm {

	public static int search(int[] arr, int n, int k) {
		int low = 0;
		int high = n - 1;
		while (low < high) {
			int mid = low + (high - 1) / 2;
			if (arr[mid] == k) {
				return mid;
			}
			if (arr[mid] <= k) {
				low = mid + 1;
			} else if (arr[mid] > k) {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(search(arr, arr.length, 5));
	}

}
