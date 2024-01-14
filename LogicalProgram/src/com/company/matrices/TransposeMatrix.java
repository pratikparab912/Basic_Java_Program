package com.company.matrices;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of rows : ");
        int rows = scanner.nextInt();
        System.out.println("\nEnter a number of columns : ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];
        System.out.println("\nEnter an elements of a matrix : ");
        for(rows=0;rows<= matrix.length-1;rows++) {
            for(columns=0;columns<= matrix.length-1;columns++) {
                matrix[rows][columns] = scanner.nextInt();
            }
        }

        System.out.println("\nGiven Matrix : ");
        for(rows=0;rows<= matrix.length-1;rows++) {
            for(columns=0;columns<= matrix.length-1;columns++) {
                System.out.print(matrix[rows][columns] +" ");
            }
            System.out.println("\n");
        }

        for(rows=0;rows<= matrix.length-1;rows++) {
            for(columns=0;columns<= matrix.length-1;columns++) {
                int temp = matrix[rows][columns];
                matrix[rows][columns] = matrix[columns][rows];
                matrix[columns][rows] = temp;
            }
        }

        System.out.println("\nTranspose Of Given Matrix : ");
        for(rows=0;rows<= matrix.length-1;rows++) {
            for(columns=0;columns<= matrix.length-1;columns++) {
                System.out.print(matrix[columns][rows] +" ");
            }
            System.out.println("\n");
        }

    }
}

// Line No 40 is important