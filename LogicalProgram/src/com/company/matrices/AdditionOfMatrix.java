package com.company.matrices;

import java.util.Scanner;

public class AdditionOfMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of rows : ");
        int rows = scanner.nextInt();
        System.out.println("\nEnter a number of columns : ");
        int columns = scanner.nextInt();

        int[][] m1 = new int[rows][columns];
        System.out.println("\nEnter an elements of matrix1");
        for(rows=0;rows<=m1.length-1;rows++) {
            for(columns=0;columns<=m1.length-1;columns++) {
                m1[rows][columns] = scanner.nextInt();
            }
        }

        System.out.println("\nPrint Matrix1 : ");
        for(rows=0;rows<=m1.length-1;rows++) {
            for(columns=0;columns<=m1.length-1;columns++) {
                System.out.print(m1[rows][columns] +" ");
            }
            System.out.println("\n");
        }

        int[][] m2 = new int[rows][columns];
        System.out.println("\nEnter an elements of matrix2");
        for(rows=0;rows<=m2.length-1;rows++) {
            for(columns=0;columns<=m2.length-1;columns++) {
                m2[rows][columns] = scanner.nextInt();
            }
        }

        System.out.println("\nPrint Matrix2 : ");
        for(rows=0;rows<=m2.length-1;rows++) {
            for(columns=0;columns<=m2.length-1;columns++) {
                System.out.print(m2[rows][columns] +" ");
            }
            System.out.println("\n");
        }

        int[][] sum = new int[rows][columns];
        for (rows=0;rows<= m1.length-1;rows++) {
            for (columns=0;columns<= m2.length-1;columns++) {
                sum[rows][columns] = m1[rows][columns] + m2[rows][columns];
            }
        }

        System.out.println("\nAddition Of matrix : ");
        for (rows=0;rows<= m1.length-1;rows++) {
            for (columns=0;columns<= m2.length-1;columns++) {
                System.out.print(sum[rows][columns] +" ");
            }
            System.out.println("\n");
        }
    }
}
