// WAP in java to perform addition and multiplication of two 3*3 matrices

import java.util.Scanner;
public class Five {
    public static void main(String[] args) {
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        int[][] arr3 = new int[3][3];
        int[][] arr4 = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter values for first matrix");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter values for second matrix");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("first matrix");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("second matrix");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("addition of two matrices");
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("multiplication of two matrices");
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                for (int k = 0; k < arr4.length; k++) {
                    arr4[i][j] += arr1[i][k] * arr2[k][j];
                    System.out.print(arr4[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
