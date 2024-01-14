package com.company.matrices;

import java.util.Scanner;

public class PrintDiagonalElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of rows : ");
        int rows = scanner.nextInt();
        System.out.println("\nEnter a number of columns : ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];
        System.out.println("\nEnter elements of an matrix : ");
        for(rows=0;rows<=matrix.length-1;rows++) {
            for(columns=0;columns<=matrix.length-1;columns++) {
                matrix[rows][columns] = scanner.nextInt();
            }
        }

        System.out.println("\nPrint Matrix : ");
        for(rows=0;rows<=matrix.length-1;rows++) {
            for(columns=0;columns<=matrix.length-1;columns++) {
                System.out.print(matrix[rows][columns] +" ");
            }
            System.out.println("\n");
        }

        System.out.println("\nPrint Diagonal Elements : ");
        for(rows=0;rows<=matrix.length-1;rows++) {
            for (columns=0;columns<=matrix.length-1;columns++) {
                if(rows==columns) {
                    System.out.print(matrix[rows][columns] +" ");
                }
            }
        }
    }
}
