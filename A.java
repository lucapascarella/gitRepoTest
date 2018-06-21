
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
        lastSum = a + b;
        return lastSum;
    }

    private void initialize() {
        // Initialize instance variable
        this.lastSum = 0;
    }

    public static void startClient(String name, Registry.Factory<? extends Client> client, String[] args)  throws IOException, Exception{
    	doSomethingHere();

    }
}
