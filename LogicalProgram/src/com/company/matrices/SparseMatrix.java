package com.company.matrices;

import java.util.Scanner;

public class SparseMatrix {
    // if No of 0 > (rows*column)/2 then it is sparse matrix
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of rows : ");
        int rows = scanner.nextInt();
        System.out.println("\nEnter a number of columns : ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];
        System.out.println("\nEnter an elements of matrix : ");
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

        int count = 0;
        for(rows=0;rows<= matrix.length-1;rows++) {
            for (columns=0;columns<= matrix.length-1;columns++) {
                if(matrix[rows][columns] == 0) {
                    count++;
                }
            }
        }

        System.out.println((count > ((rows*columns) / 2)) ? "Sparse Matrix!" : "Not a sparse matrix!");
    }
}
