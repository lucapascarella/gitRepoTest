
public class B extends A {

    private int b;

    public B(int b) {
        this.b = b;
    }

    public String returnStringB(String str) {
        return this.thisMethodHasBeenRenamed(str);
    }

    private String thisMethodHasBeenRenamed(String str) {
        str = str + b;
        return str.toLowerCase();
    }

}
