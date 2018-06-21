
public class B extends A {

    private int b;
    
    public B (int b) {
        this.b = b;
    }
    
    public String returnStringB(String str) {
        return this.doSomethingInB(str);
    }
    
    private String doSomethingInB(String str) {
        str = str + b;
        return str.toLowerCase();
    }
    
}
