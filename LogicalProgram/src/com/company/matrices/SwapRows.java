package com.company.matrices;

import java.util.Scanner;

public class SwapRows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of rows : ");
        int rows = scanner.nextInt();
        System.out.println("\nEnter a number of columns : ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];
        System.out.println("\nEnter an elements of an matrix : ");
        for(rows=0; rows<= matrix.length-1; rows++) {
            for(columns=0; columns<= matrix.length-1; columns++) {
                matrix[rows][columns] = scanner.nextInt();
            }
        }

        System.out.println("\nGiven Matrix : ");
        for(rows=0;rows<= matrix.length-1;rows++) {
            for (columns=0;columns<= matrix.length-1;columns++) {
                System.out.print(matrix[rows][columns] +" ");
            }
            System.out.println("\n");
        }

        System.out.println("Enter a rows to swap : ");
        int swapRow1 = scanner.nextInt();
        int swapRow2 = scanner.nextInt();

//        int temp = 0;
//
//        for(rows=0; rows<= matrix.length-1;rows++) {
//            temp = matrix[swapRow1-1][rows];
//            matrix[swapRow1-1][rows] = matrix[swapRow2-1][rows];
//            matrix[swapRow2-1][rows] = temp;
//        }

        for(rows=0;rows<= matrix.length-1;rows++) {
            for(columns=0;columns<= matrix.length-1;columns++) {
                int temp = matrix[swapRow1-1][columns];
                matrix[swapRow1-1][columns]=matrix[swapRow2-1][columns];
                matrix[swapRow2-1][columns] = temp;
            }
        }

        System.out.println("\nMatrix After Swapping : ");
        for(rows=0;rows<= matrix.length-1;rows++) {
            for (columns=0;columns<= matrix.length-1;columns++) {
                System.out.print(matrix[rows][columns] +" ");
            }
            System.out.println("\n");
        }
    }
}
