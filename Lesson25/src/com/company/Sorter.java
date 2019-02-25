package com.company;

public class Sorter {
    private static int[] helper;//вспомогательный массив для копирования элементов при слиянии

    public static void mergeSort(int[] arr) {
        helper = new int[arr.length];
        sort(arr, 0, arr.length - 1);
    }
    //{4, 2, 6, 2, 8, 1, 2, 5}
    private static void sort(int[] arr, int low, int high) {
        if (low >= high) {//если в данной части 1 элемент или меньше
            return;
        }
        int mid = low + (high - low) / 2;//вычислили середину
        sort(arr, low, mid);//отсортировали левую часть
        sort(arr, mid + 1, high);//отсортировали правую часть
        merge(arr, low, mid, high);
    }
    //arr = {1, 2, 4, 6, 1, 2, 5, 8}
    //low = 0, mid = 3, high = 7
    //......
    //helper = {2, 2, 4, 6, 1, 2, 5, 8}
    //i = 0; j = 5;
    private static void merge(int[] arr, int low, int mid, int high) {
        int i = low;//начальная позиция указателя текущего элемента в левой
        int j = mid + 1;//..в правой части
        //копирование во вспомогательный
        for (int k = low; k <= high; k++) {
            helper[k] = arr[k];
        }
        int k = low;//указатель места, в которое вставим элемент в arr
        while (i <= mid && j <= high) {
            if (helper[i] < helper[j]) {
                arr[k++] = helper[i++];//выписали из левой части и сдвинулись
            } else {
                arr[k++] = helper[j++];
            }
        }
        //из следующих двух циклов запустится только один
        while (i <= mid) {
            arr[k++] = helper[i++];
        }
        while (j <= high) {
            arr[k++] = helper[j++];
        }
    }
    //{1, 1, 1, 1, 2, 3, 4, 5}

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int indexOfMax = 0;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[indexOfMax] < arr[j]) {
                    indexOfMax = j;
                }
            }
            int b = arr[indexOfMax];
            arr[indexOfMax] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = b;
        }
    }
}














