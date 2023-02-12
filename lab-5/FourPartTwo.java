// print pattern 
// 12344321
// 123**321
// 12****21
// 1******1

public class FourPartTwo {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2*n; j++) {
                if (j < n - i) {
                    System.out.print(j + 1);
                } else if (j > n + i) {
                    System.out.print(2*n - j);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
