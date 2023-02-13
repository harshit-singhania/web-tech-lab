// find min and max value in an array

import java.util.Scanner;
class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter value"); 
            arr[i] = sc.nextInt();
        }
        System.out.println();
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }
}
