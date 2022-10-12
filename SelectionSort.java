
public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 6, 1, 3, 2, 4, 5 };

		selection_sort(arr);

		for (int n : arr) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

	private static void selection_sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int pos = i;

			for (int j = pos + 1; j < arr.length; j++) {
				if (arr[j] < arr[pos])
					pos = j;
			}

			if (pos != i) {
				int temp = arr[i];
				arr[i] = arr[pos];
				arr[pos] = temp;
			}
		}
	}

}
