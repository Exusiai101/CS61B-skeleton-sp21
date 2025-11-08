/** Class that prints the Collatz sequence starting from a given number.
 *  @author YOUR NAME HERE
 */
public class Collatz {

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isOdd(int number) {
        if (number % 2 == 1) {
            return true;
        } else  {
            return false;
        }
    }
    /** Buggy implementation of nextNumber! */
    public static int nextNumber(int n) {
        if (n == 1) {
            return 1;
        } else if (isEven(n)) {
            return n/2;
        }else if (isOdd(n)) {
            return 3*n+1;
        }
        return 1;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + " ");
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

