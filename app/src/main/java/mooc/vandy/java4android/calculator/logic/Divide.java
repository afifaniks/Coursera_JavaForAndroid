package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    // TODO -- start your code here
    int a;
    int b;

    public Divide(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int[] operation() {
        int quo = a/b;
        int re = a%b;

        int arr[] = {quo, re};

        return arr;
    }
}
