package ArrayPractice;

public class UniqueArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 2, 3, 5, 6 };

		int result = uniqueArrSum(arr, arr.length);

		System.out.println("Unique Array Sum " + result);
	}

	static int uniqueArrSum(int[] arr, int n) {

		int sum = arr[0];

		for (int i = 1; i < n; i++) {
			if (arr[i] == arr[i - 1]) {
				int j = i;
				while (j < n && arr[j] <= arr[j - 1]) {
					arr[j] = arr[j] + 1;
					j++;
				}
			}
			sum = arr[i] + sum;
		}
		return sum;
	}

}
