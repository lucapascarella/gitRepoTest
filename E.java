
public class B extends A {

    private int a;

    public B(int b) {
        this.b = b;
    }

    public String returnStringB(String str) {
        return this.thisMethodHasBeenRenamed(str);
    }

    private String thisMethodHasBeenRenamed(String str) {
        str = strE;
        return str.toLowerCase();
    }

}
