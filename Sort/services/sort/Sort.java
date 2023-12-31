package Sort.services.sort;

import java.util.Timer;

import Sort.components.ViewCards;

public class Sort {
    public static <T extends Comparable<T>> void bubbleSort(T[] a) {
        BubbleSort.sort(a);
    }

    public static <T extends Comparable<T>> void bubbleSortWithAnimation(Timer timer, ViewCards viewCards, int period) {
        BubbleSort.sortWithAnimation(timer, viewCards, period);
    }

    public static <T extends Comparable<T>> void selectionSort(T[] a) {
        SelectionSort.sort(a);
    }

    public static <T extends Comparable<T>> void selectionSortWithAnimation(Timer timer, ViewCards viewCards,
            int period) {
        SelectionSort.sortWithAnimation(timer, viewCards, period);
    }

    public static <T extends Comparable<T>> void insertionSort(T[] a) {
        InsertionSort.sort(a);
    }

    public static <T extends Comparable<T>> void insertionSortWithAnimation(Timer timer, ViewCards viewCards,
            int period) {
        InsertionSort.sortWithAnimation(timer, viewCards, period);
    }

    public static <T extends Comparable<T>> void mergeSort(T[] a) {
        MergeSort.sort(a);
    }

    public static <T extends Comparable<T>> void mergeSortWithAnimation(Timer timer, ViewCards viewCards, int period) {
        MergeSort.sortWithAnimation(timer, viewCards, period);
    }

    public static <T extends Comparable<T>> void quickSort(T[] a) {
        QuickSort.sort(a);
    }

    public static <T extends Comparable<T>> void quickSortWithAnimation(Timer timer, ViewCards viewCards, int period) {
        QuickSort.sortWithAnimation(timer, viewCards, period);
    }
}
