package com.company;

public class Max {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 2, 3}, {7, 2, 9}};

        int maxRowIndex = 0;
        int maxSum = rowSum(arr, 0);
        for (int i = 0; i < arr.length; i++) {
            int currentRowSum = rowSum(arr, i);
            if (currentRowSum > maxSum) {
                maxRowIndex = i;
                maxSum = currentRowSum;
            }
        }

    }

    static int rowSum(int[][] matrix, int rowNum) {
        int sum = 0;
        if (matrix.length > 0 && rowNum < matrix.length) {
            for (int i = 0; i < matrix[0].length; i++) {
                sum += matrix[rowNum][i];
            }
        }
        return sum;
    }

    static int columnSum(int[][] matrix, int columnNum) {
        int sum = 0;
        if (matrix.length > 0 && columnNum < matrix[0].length) {
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][columnNum];
            }
        }
        return sum;
    }
}











