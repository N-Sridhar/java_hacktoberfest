class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 5, 2, 1, 6, 3, 4 };

		bubble_sort(arr);

		for (int n : arr) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

	private static void bubble_sort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}