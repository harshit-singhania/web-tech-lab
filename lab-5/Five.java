// convert number into words

public class Five {
    public static void main(String[] args) {
        int n = 123;
        int temp = n;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        int[] arr = new int[count];
        int i = 0;
        while (n > 0) {
            arr[i] = n % 10;
            n /= 10;
            i++;
        }
        for (int j = arr.length - 1; j >= 0; j--) {
            switch (arr[j]) {
                case 0:
                    System.out.print("zero ");
                    break;
                case 1:
                    System.out.print("one ");
                    break;
                case 2:
                    System.out.print("two ");
                    break;
                case 3:
                    System.out.print("three ");
                    break;
                case 4:
                    System.out.print("four ");
                    break;
                case 5:
                    System.out.print("five ");
                    break;
                case 6:
                    System.out.print("six ");
                    break;
                case 7:
                    System.out.print("seven ");
                    break;
                case 8:
                    System.out.print("eight ");
                    break;
                case 9:
                    System.out.print("nine ");
                    break;
            }
        }
    }
}
