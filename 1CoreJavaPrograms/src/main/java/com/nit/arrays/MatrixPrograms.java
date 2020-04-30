package com.nit.arrays;

import java.util.Scanner;

public class MatrixPrograms {

	public static void matrix(int rows, int col) {

		int[][] a = new int[rows][col];
		int[][] b = new int[rows][col];
		int[][] c = new int[rows][col];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first matrix numbers");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j] = sc.nextInt();

			}

		}

		System.out.println("Enter second matrix numbers");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				b[i][j] = sc.nextInt();

			}

		}

		System.out.println("Addition of given matrix..1");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				c[i][j] = a[i][j] * b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		matrix(2, 3);

	}

}
