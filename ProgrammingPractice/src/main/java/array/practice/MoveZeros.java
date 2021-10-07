package array.practice;

public class MoveZeros {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 0, 3, 0 };

		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[j] = arr[i];
				j++;
			}

		}
		for (int k = j; k < arr.length; k++) {
			arr[k] = 0;
		}

	}

}
