package array.practice;

public class MergeTwoArrays {

	public static void mergeArray(int[] arr1, int[] arr2, int n1, int n2, int[] arr3) {
		int i = 0, j = 0, k = 0;
		while (i < n1 && j < n2) {
			if (arr1[i] < arr2[j]) {
				arr3[k++] = arr1[i++];

			} else {
				arr3[k++] = arr2[j++];
			}
		}

		while (i < n1) {
			arr3[k++] = arr1[i++];
		}
		while (j < n2) {
			arr3[k++] = arr2[j++];
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7 };
		int[] arr2 = { 2, 4, 6, 8 };
		int[] arr3 = new int[arr1.length + arr2.length];
		mergeArray(arr1, arr2, arr1.length, arr2.length, arr3);
		for (int a : arr3) {
			System.out.print(a + " ");
		}

	}

}
