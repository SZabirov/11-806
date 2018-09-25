package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.println("Введите число строк (и столбцов):");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        boolean itsMagic = true;
        int diagonalSum = 0;
        for (int i = 0; i < n; i++) {
            diagonalSum += matrix[i][i];
        }
        int collateralDiagonalSum = 0;
        for (int i = 0; i < n; i++) {
            collateralDiagonalSum += matrix[i][n - 1 - i];
        }
        if (diagonalSum != collateralDiagonalSum) {
            itsMagic = false;
        }
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += matrix[i][j];
            }
            if (sum != diagonalSum) {
                itsMagic = false;
            }
        }
    }
}





