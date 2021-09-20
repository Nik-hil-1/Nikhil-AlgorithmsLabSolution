package com.gl.lab.currencydenomination;

public class MergeSort {

	public void sort(int[] notes, int low, int high) {

		if (low < high) {
			int mid = (low + high) / 2;
			sort(notes, low, mid);
			sort(notes, mid + 1, high);
			merge(notes, mid, low, high);
		}
	}

	public void merge(int[] notes, int mid, int low, int high) {

		int n1 = mid - low + 1;
		int n2 = high - mid;

		int[] leftArray = new int[n1];
		int[] rightArray = new int[n2];

		for (int i = 0; i < n1; i++) {
			leftArray[i] = notes[low + i];
		}

		for (int i = 0; i < n2; i++) {
			rightArray[i] = notes[mid + 1 + i];
		}

		int i = 0, j = 0, k = low;

		for (; i < n1 && j < n2; k++) {

			if (leftArray[i] >= rightArray[j]) {
				notes[k] = leftArray[i];
				i++;
			} else {
				notes[k] = rightArray[j];
				j++;
			}
		}

		while (i < n1) {
			notes[k] = leftArray[i];
			k++;
			i++;
		}

		while (j < n2) {
			notes[k] = rightArray[j];
			k++;
			j++;
		}
	}

}
