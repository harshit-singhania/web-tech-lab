// print pattern 
// *000*000*
// 0*00*00*0
// 00*0*0*00
// 000***000

class FourPartOne {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2*n; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
