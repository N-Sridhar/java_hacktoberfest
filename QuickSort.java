
public class QuickSort {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 1, 6, 2, 3 };

		quick_sort(arr, 0, arr.length - 1);

		for (int n : arr) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

	private static void quick_sort(int[] arr, int start, int end) {
		if (start < end) {
			int p = partitioning(arr, start, end);

			quick_sort(arr, start, p - 1);
			quick_sort(arr, p + 1, end);
		}
	}

	private static int partitioning(int[] arr, int start, int end) {
		int pivot = arr[end];
		int pos = start - 1;

		for (int curr = start; curr < end; curr++) {
			if (arr[curr] <= pivot) {
				pos++;

				int temp = arr[pos];
				arr[pos] = arr[curr];
				arr[curr] = temp;
			}
		}
		int temp = arr[end];
		arr[end] = arr[pos + 1];
		arr[pos + 1] = temp;

		return pos + 1;
	}

}
