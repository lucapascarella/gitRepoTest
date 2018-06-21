
public class A {

    private int lastSum;

    public A() {
        super();
        initialize();
    }

    /**
     * This method return a sum of two numbers
     * 
     * @param a
     *            first number
     * @param b
     *            second number
     * @return sum of inputs
     */
    public int addNumbers(int a, int b) {
        int sum = a + b;
        this.lastSum = sum;
        return sum;
    }

    private void initialize() {
        // Initialize instance variable
        this.lastSum = 0;
    }
}
