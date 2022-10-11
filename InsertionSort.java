public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 6, 4, 5 };
		
		insertion_sort(arr);
		
		for (int n : arr) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
	
	private static void insertion_sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int prev = i - 1;
			while (prev >= 0 && arr[prev] > key) {
				arr[prev + 1] = arr[prev];
				prev -= 1;
			}
			arr[prev + 1] = key;
		}
	}
}
