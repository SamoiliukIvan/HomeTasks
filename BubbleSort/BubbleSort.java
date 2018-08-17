import java.util.Arrays;

public class BubbleSort {

	static void toBubbleSort(int[] array) {
		int temp = 0;
		for (int i = array.length - 1; i > 0; i--) {
			for (int minNumber = array.length - 1; minNumber > 0; minNumber--) {
				if (array[minNumber] < array[minNumber - 1]) {
					temp = array[minNumber - 1];
					array[minNumber - 1] = array[minNumber];
					array[minNumber] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {1, 25, 100, 888, 13, 2, 800, 5, 100, 10, 2};
		toBubbleSort(arr);
		System.out.println(Arrays.toString(arr));

	}
}
